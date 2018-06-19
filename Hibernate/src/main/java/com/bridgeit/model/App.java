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
    	
    	Configuration cfg=new Configuration();
    	cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        Employee emp=new Employee();
        emp.setId(101);
        emp.setName("tejal");
        emp.setCity("punenagrifghfg");
        emp.setState("Maharastrafghf");
        
        session.beginTransaction();
        
        session.persist(emp);
        
        session.getTransaction().commit();
        
        session.close();
        
        System.out.println("record add succesfully"); 
       
       
    }
}
