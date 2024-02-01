package org.example;
import model.Department;
import model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while(isContinue) {
            System.out.println("========================================");
            System.out.println("Welcome to  manyToOneInteractive!!");
            System.out.println("What would you like to do?: ");
            System.out.println("1. Add, Modify, or Delete a Department");
            System.out.println("2. Add, Modify, or Delete a Teacher");
            System.out.println("3. Assign teacher to a specific department");
            System.out.println("Press other keys to exit.");
            System.out.print("Enter your choice here: ");
            String choice = scanner.next();
            if(choice.equals("1")) {
                runDepartment(session);
            } else if(choice.equals("2")) {
                runTeacher(session);
            } else if (choice.equals("3")) {
                runTeacherToDepartment(session);
            }else {
                System.out.println("Thank you for using manyToOneInteractive!  Goodbye!");
                isContinue = false;
            }
        }
        scanner.close();
        factory.close();
        session.close();
    }

    //Add, Modify, or Delete Department
    public static void runDepartment(Session session){
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = session.beginTransaction();
        ArrayList<Department> depsArray = new ArrayList<Department>();
        System.out.println("========================================");
        System.out.println("Welcome to Department function!!");
        System.out.println("Pick a function listed below: ");
        System.out.println("1. Add Department(s)");
        System.out.println("2. Modify Department");
        System.out.println("3. Delete Department");
        System.out.println("Press other keys to exit.");
        System.out.print("Enter your choice here: ");
        String choice = scanner.next();
        if(choice.equals("1")) {
            System.out.print("Enter the number of departments to Add: ");
            int numDep = scanner.nextInt();
            for (int i = 0; i < numDep; i++) {
                System.out.print("Enter Dept Name: ");
                String depName = scanner.next();
                Department dep = new Department(depName);
                depsArray.add(dep);
            }
            for (int i = 0; i < depsArray.size(); i++) {
                session.persist(depsArray.get(i));
            }
            transaction.commit();
        } else if (choice.equals("2")) {
            System.out.println("Enter id of the department to edit: ");
            int deptId = scanner.nextInt();
            Department department = session.get(Department.class, deptId);
            if(department == null) {
                System.out.println("========================================");
                System.out.println("         Department not found!          ");
                System.out.println("========================================");
            } else {
                System.out.print("Enter the name to update: ");
                String newName = scanner.next();
                department.setDeptName(newName);
                session.merge(department);
                transaction.commit();
                System.out.println("========================================");
                System.out.println("          Department updated!           ");
                System.out.println("========================================");
            }
        } else if (choice.equals("3")) {
            System.out.println("Enter the id of the department to be deleted: ");
            int deptId = scanner.nextInt();
            Department department = session.get(Department.class, deptId);
            if(department == null) {
                System.out.println("========================================");
                System.out.println("        Department not found            ");
                System.out.println("========================================");
            } else {
                session.remove(department);
                transaction.commit();
                System.out.println("========================================");
                System.out.println("         Department deleted             ");
                System.out.println("========================================");
            }
        } else {
            System.out.println("Exiting to main function.");
        }
    }

    //Add, Modify, or Delete Teacher
    private static void runTeacher(Session session) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = session.beginTransaction();
        ArrayList<Teacher> teachersArray = new ArrayList<Teacher>();
        System.out.println("========================================");
        System.out.println("Welcome to Teacher functions!!");
        System.out.println("Pick a function listed below: ");
        System.out.println("1. Add Teacher(s)");
        System.out.println("2. Modify Teacher");
        System.out.println("3. Delete Teacher");
        System.out.println("Press other keys to exit.");
        System.out.print("Enter your choice here: ");
        String choice = scanner.next();
        if(choice.equals("1")) {
            System.out.print("Enter the number of teachers to Add: ");
            int numTeacher = scanner.nextInt();
            for (int i = 0; i < numTeacher; i++) {
                System.out.print("Enter teacher's name: ");
                String teacherName = scanner.next();
                System.out.print("Enter teacher's salary: ");
                String teacherSalary = scanner.next();
                Teacher teacher = new Teacher();
                teacher.setSalary(teacherSalary);
                teacher.setTeacherName(teacherName);
                teachersArray.add(teacher);
            }
            for (int i = 0; i < teachersArray.size(); i++) {
                session.persist(teachersArray.get(i));
            }
            transaction.commit();
        } else if (choice.equals("2")) {
            System.out.println("Enter teacher's id to edit that teacher: ");
            int teacherId = scanner.nextInt();
            Teacher teacher = session.get(Teacher.class, teacherId);
            if(teacher == null) {
                System.out.println("========================================");
                System.out.println("Teacher not found");
                System.out.println("========================================");
            } else {
                System.out.print("Enter the name and salary to update separated by space between: ");
                String newName = scanner.next();
                String newSalary = scanner.next();
                teacher.setTeacherName(newName);
                teacher.setSalary(newSalary);
                session.merge(teacher);
                transaction.commit();
                System.out.println("========================================");
                System.out.println("Teacher updated");
                System.out.println("========================================");
            }
        } else if (choice.equals("3")) {
            System.out.println("Enter the id of the teacher to be deleted: ");
            int teacherId = scanner.nextInt();
            Teacher teacher = session.get(Teacher.class, teacherId);
            if(teacher == null) {
                System.out.println("========================================");
                System.out.println("Teacher not found");
                System.out.println("========================================");
            } else {
                session.remove(teacher);
                transaction.commit();
                System.out.println("========================================");
                System.out.println("Teacher deleted");
                System.out.println("========================================");
            }
        } else {
            System.out.println("Exiting to main function.");
        }
    }

    private static void runTeacherToDepartment(Session session) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = session.beginTransaction();
        System.out.println("Welcome to TeacherToDepartment function!!");
        boolean teacherNotFound = true;
        boolean departmentNotFound = true;
        while(teacherNotFound) {
            System.out.print("Enter the id of the teacher to assign: ");
            int departId;
            Department department;
            int teacherId = scanner.nextInt();
            Teacher teacher = session.get(Teacher.class, teacherId);
            if(teacher == null) {
                System.out.println("Teacher not found!");
            } else {
                teacherNotFound = false;
                while(departmentNotFound) {
                    System.out.print("Enter the id of the department to be assigned to that teacher: ");
                    departId = scanner.nextInt();
                    department = session.get(Department.class, departId);
                    if(department == null) {
                        System.out.println("Department not found.  Try again!");
                    } else {
                        departmentNotFound = false;
                        teacher.setDep(department);
                        transaction.commit();
                        System.out.println("========================================");
                        System.out.println(teacher.getTeacherName() + " has been assigned to " + department.getDeptName() + " department");
                        System.out.println("========================================");
                    }
                }
            }
        }
    }
}