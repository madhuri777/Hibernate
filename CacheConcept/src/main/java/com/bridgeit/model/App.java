package com.bridgeit.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.bridgeit.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Doctor d;
        Session session=HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
       
        d=(Doctor)session.get(Doctor.class, 1);
        System.out.println("values :"+d);
        System.out.println();
        session.getTransaction().commit();
        
        System.out.println("sesion two "+"\n");
        Session session2=HibernateUtil.getSessionFactory().openSession();
        
        session2.beginTransaction();
       
        d=(Doctor)session2.get(Doctor.class, 1);
        System.out.println("values :"+d);

        
        System.out.println("take out Succesfully");
        session2.getTransaction().commit();
        session.close();
        session2.close();
    }
}
