package controller;

import model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DepartmentController {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

//        addDepartment(factory,session);

//        findDepartment(factory,session,3);

//        updateDepartment(session,3);

//        deleteDepartment(session,4);

        factory.close();
        session.close();
    }
    public static void addDepartment(SessionFactory factory, Session session) {
        Transaction transaction = session.beginTransaction();
        Department dOne = new Department();
        dOne.setName("DMV");
        dOne.setState("California");

        Department dTwo = new Department();
        dTwo.setName("Water Department");
        dTwo.setState("California");

        Department dThree = new Department();
        dThree.setName("Electric Department");
        dThree.setState("California");

        Department dFour = new Department();
        dFour.setName("Fire Department");
        dFour.setState("California");

        Department dFive = new Department();
        dFive.setName("Ambulance Department");
        dFive.setState("Nevada");

        session.persist(dOne);
        session.persist(dTwo);
        session.persist(dThree);
        session.persist(dFour);
        session.persist(dFive);

        transaction.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();
    }

    public static void findDepartment(SessionFactory factory,Session session,int deptId){
        Transaction tx = session.beginTransaction();
        Department d = session.get(Department.class, deptId);
        System.out.println("FullName: " + d.getName());
        System.out.println("State: " + d.getState());

        //Close resources
        tx.commit();
        factory.close();
        session.close();
    }

    public static void updateDepartment(Session session, int deptId) {
        Transaction tx = session.beginTransaction();
        Department d = new Department();
        d.setDid(deptId);
        d.setName("Environment Department");
        d.setState("Washington");

        session.merge(d);
        session.getTransaction().commit();
        session.close();
    }

    public static void deleteDepartment(Session session,int deptId){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Transaction tx = session.beginTransaction();
        Department d = new Department();
        d.setDid(deptId);
        session.remove(d);
        tx.commit();
        session.close();
        factory.close();
    }
}
