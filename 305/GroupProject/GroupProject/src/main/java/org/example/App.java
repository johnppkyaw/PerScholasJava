package org.example;
import model.Department;
import model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        manyToOneInteractive();
    }
    private static void manyToOneInteractive() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while(isContinue) {
            displayMainMenu();
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    manageDepartment(session, scanner);
                    break;
                case "2":
                    manageTeacher(session, scanner);
                    break;
                case "3":
                    assignTeacherToDepartment(session, scanner);
                    break;
                default:
                    System.out.println("Thank you for using the application! Goodbye!");
                    isContinue = false;
                    break;
            }
        }
        scanner.close();
        factory.close();
        session.close();
    }

    //Prints out main menu.
    private static void displayMainMenu() {
        System.out.println("========================================");
        System.out.println("Welcome to manyToOneInteractive program!");
        System.out.println("What would you like to do?");
        System.out.println("1. Department Table Management");
        System.out.println("2. Teacher Table Management");
        System.out.println("3. Assign teacher to a specific department");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("========================================");
        System.out.print("Enter your choice here: ");
    }


    //Add, Modify, or Delete Department

    private static void manageDepartment(Session session, Scanner scanner){
        Transaction transaction = session.beginTransaction();

        displayDepartmentMenu();

        String choice = scanner.next();
        if(choice.equals("1")) {
            addDepartment(session, scanner);
        } else if (choice.equals("2")) {
            modifyDepartment(session, scanner);
        } else if (choice.equals("3")) {
            deleteDepartment(session, scanner);
        } else {
            System.out.println("=========================");
            System.out.println("Exiting to the main menu.");
            System.out.println("=========================");
        }
        transaction.commit();
    }

    //Prints Department Menu
    private static void displayDepartmentMenu() {
        System.out.println("========================================");
        System.out.println("Welcome to Department Table Management!");
        System.out.println("Select a function listed below: ");
        System.out.println("1. Add department(s)");
        System.out.println("2. Modify a department");
        System.out.println("3. Delete a department");
        System.out.println("Press other keys to go back to the main menu.");
        System.out.println("========================================");
        System.out.print("Enter your choice here: ");
    }
    private static void addDepartment(Session session, Scanner scanner) {
        ArrayList<Department> depsArray = new ArrayList<Department>();
        System.out.print("Enter the number of departments to Add: ");
        int numDep = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numDep; i++) {
            System.out.print("Enter Dept Name: ");
            String depName = scanner.nextLine();
            Department dep = new Department(depName);
            depsArray.add(dep);
        }
        for (int i = 0; i < depsArray.size(); i++) {
            session.persist(depsArray.get(i));
        }
    }

    private static void modifyDepartment(Session session, Scanner scanner) {
//        System.out.print("Enter id of the department to edit: ");
//        int deptId = scanner.nextInt();
//        scanner.nextLine();
//        Department department = session.get(Department.class, deptId);
        System.out.print("Enter the name of the department to edit: ");
        scanner.nextLine();
        String deptName = scanner.nextLine();
        String hql = "FROM Department d WHERE d.deptName = :depName";
        Query<Department> query = session.createQuery(hql, Department.class);
        query.setParameter("depName", deptName);
        Department department = query.uniqueResult();

        if(department == null) {
            System.out.println("========================================");
            System.out.println("         Department not found!          ");
            System.out.println("========================================");
        } else {
            System.out.print("Enter the name to update: ");
            String newName = scanner.nextLine();
            department.setDeptName(newName);
            session.merge(department);
            System.out.println("========================================");
            System.out.println("          Department updated!           ");
            System.out.println("========================================");
        }
    }
    private static void deleteDepartment(Session session, Scanner scanner) {
        System.out.print("Enter the id of the department to be deleted: ");
        int deptId = scanner.nextInt();
        Department department = session.get(Department.class, deptId);
        if(department == null) {
            System.out.println("========================================");
            System.out.println("        Department not found!           ");
            System.out.println("========================================");
        } else {
            // Fetch the associated teachers
            String hql = "FROM Teacher WHERE department = :dept";
            Query<Teacher> query = session.createQuery(hql, Teacher.class);
            query.setParameter("dept", department);
            List<Teacher> teachers = query.getResultList();

            // Set department to null for each associated teacher
            for (Teacher teacher : teachers) {
                teacher.setDep(null);
                session.merge(teacher);
            }
            session.remove(department);
            System.out.println("========================================");
            System.out.println("         Department deleted!            ");
            System.out.println("========================================");
        }
    }

    //Add, Modify, or Delete Teacher
    private static void manageTeacher(Session session, Scanner scanner) {
        Transaction transaction = session.beginTransaction();
        displayTeacherMenu();

        String choice = scanner.next();
        if(choice.equals("1")) {
            addTeacher(session, scanner);
        } else if (choice.equals("2")) {
            modifyTeacher(session, scanner);
        } else if (choice.equals("3")) {
            deleteTeacher(session, scanner);
        } else {
            System.out.println("=========================");
            System.out.println("Exiting to the main menu.");
            System.out.println("=========================");
        }
        transaction.commit();
    }
    private static void displayTeacherMenu() {
        System.out.println("========================================");
        System.out.println("Welcome to Teacher Table Management!!");
        System.out.println("Select a function listed below: ");
        System.out.println("1. Add Teacher(s)");
        System.out.println("2. Modify Teacher");
        System.out.println("3. Delete Teacher");
        System.out.println("Press other keys to go back to the main menu.");
        System.out.println("========================================");
        System.out.print("Enter your choice here: ");
    }
    private static void addTeacher(Session session, Scanner scanner) {
        ArrayList<Teacher> teachersArray = new ArrayList<Teacher>();
        System.out.print("Enter the number of teachers to Add: ");
        int numTeacher = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numTeacher; i++) {
            System.out.print("Enter teacher's name: ");
            String teacherName = scanner.nextLine();
            System.out.print("Enter teacher's salary: ");
            String teacherSalary = scanner.nextLine();
            Teacher teacher = new Teacher();
            teacher.setSalary(teacherSalary);
            teacher.setTeacherName(teacherName);
            teachersArray.add(teacher);
        }
        for (int i = 0; i < teachersArray.size(); i++) {
            session.persist(teachersArray.get(i));
        }
    }
    private static void modifyTeacher(Session session, Scanner scanner) {
        System.out.print("Enter teacher's id to edit that teacher: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine();
        Teacher teacher = session.get(Teacher.class, teacherId);
        if(teacher == null) {
            System.out.println("========================================");
            System.out.println("             Teacher not found!         ");
            System.out.println("========================================");
        } else {
            System.out.println("Teacher found with the given id!");
            System.out.print("Enter the name to update: ");
            String newName = scanner.nextLine();
            System.out.print("Enter the salary to update: ");
            String newSalary = scanner.nextLine();
            teacher.setTeacherName(newName);
            teacher.setSalary(newSalary);
            session.merge(teacher);
            System.out.println("========================================");
            System.out.println("           Teacher updated!             ");
            System.out.println("========================================");
        }
    }
    private static void deleteTeacher(Session session, Scanner scanner) {
        System.out.print("Enter the id of the teacher to be deleted: ");
        int teacherId = scanner.nextInt();
        Teacher teacher = session.get(Teacher.class, teacherId);
        if(teacher == null) {
            System.out.println("========================================");
            System.out.println("          Teacher not found!            ");
            System.out.println("========================================");
        } else {
            session.remove(teacher);
            System.out.println("========================================");
            System.out.println("          Teacher deleted!              ");
            System.out.println("========================================");
        }
    }

    private static void assignTeacherToDepartment(Session session, Scanner scanner) {
        Transaction transaction = session.beginTransaction();
        System.out.print("Enter the id of the teacher to assign the department: ");
        int teacherId = scanner.nextInt();
        Teacher teacher = session.get(Teacher.class, teacherId);
        if(teacher == null) {
            System.out.println("========================================");
            System.out.println("          Teacher not found!            ");
            System.out.println("========================================");
        } else {
            System.out.println("Teacher found!");
            System.out.print("Enter the id of the department to be assigned to teacher (" +
                    teacher.getTeacherName() + "): ");
            int departId = scanner.nextInt();
            Department department = session.get(Department.class, departId);
            if(department == null) {
                System.out.println("========================================");
                System.out.println("        Department not found!           ");
                System.out.println("========================================");
            } else {
                teacher.setDep(department);
                System.out.println("==================================================");
                System.out.println(teacher.getTeacherName() + " has been assigned to " + department.getDeptName() + " department!");
                System.out.println("==================================================");
            }
        }
        transaction.commit();
    }
}