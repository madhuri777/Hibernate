package com.bridgeit.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Employee emp=new Employee();
    	// emp.setId(emp.getId());
         emp.setName("ranigh");
         emp.setCity("punenagrifghfg");
         emp.setState("Maharastrafghf");
    	Configuration cfg=new Configuration();
    	cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
       
        session.save(emp);
       // session.persist(emp);
        session.getTransaction().commit();
        session.close();
        System.out.println("record add succesfully"); 
       
       
    }
}
