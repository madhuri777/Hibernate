package com.bridgeit.model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("hiiiiiiiiiiiii");
    	Scanner scanner=new Scanner(System.in);
        Configuration config=new Configuration();
        config.configure();
        SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        Student student=new Student();
        System.out.println("enter Student FirstName");
        String fname=scanner.next();
        System.out.println("enter Student LastName");
        String lname=scanner.next();
        System.out.println("enter Student Contact Number");
        long mobileno=scanner.nextLong();
        student.setFirstName(fname);
        student.setLastName(lname);
        student.setMobileNumaber(mobileno);
        session.persist(student);
        session.getTransaction().commit();
        session.close();
        scanner.close();
        System.out.println("succesfully");
        
    }
}
