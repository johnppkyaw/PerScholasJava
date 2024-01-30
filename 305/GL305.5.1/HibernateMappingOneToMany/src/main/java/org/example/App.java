package org.example;
import model.Department;
import model.Teacher;
import model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        oneToOne();
    }
    public static void oneToMany(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        //create first two deparments
        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");
        session.persist(dept1);
        session.persist(dept2);

        //creating teacher
        Teacher t1 = new Teacher("1000","MHaseeb");
        Teacher t2 = new Teacher("2220","Shahparan");
        Teacher t3 = new Teacher("3000","James");
        Teacher t4 = new Teacher("40000","Joseph");
        Teacher t5 = new Teacher("200","Ali");

        //Add teacher entity object to the list
        ArrayList<Teacher> teachersList = new ArrayList<>();
        teachersList.add(t1);
        teachersList.add(t2);
        teachersList.add(t3);
        teachersList.add(t4);
        teachersList.add(t5);
        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        session.persist(t4);
        session.persist(t5);
        //Creating Department
        Department department = new Department();
        department.setDeptName("Development");
        department.setTeacherList(teachersList);
        //Storing Department
        session.persist(department);
        t.commit();
    }

    public static void oneToOne(){
        System.out.println("Maven + Hibernate + SQL One to One Mapping Annotations");

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();
        Address a1 = new Address("27th street","NYC","NY",11103);
        Address a2 = new Address("28th street","Buffalo","NY",15803);

        Teacher t1 = new Teacher("1000","MHaseeb");
        Teacher t2 = new Teacher("2220","Shahparan");
        t1.setAddress(a1);
        t2.setAddress(a2);



        session.persist(a1);
        session.persist(a2);
        session.persist(t1);
        session.persist(t2);

        t.commit();
    }

}