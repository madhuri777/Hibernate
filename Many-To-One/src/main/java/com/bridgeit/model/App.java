package com.bridgeit.model;

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
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
         Address address=new Address();
         address.setAddres_id(1);
         address.setCity("Mumbai");
         address.setState("Maharastra");
         address.setZipcod(400084);
         
         Student student=new Student();
         Student student2=new Student();
         
         student.setRoll_no(101);
         student.setStd_name("Manali");
         student.setStd_address(address);
         
         student2.setRoll_no(102);
         student2.setStd_name("vidya");
         student2.setStd_address(address);
         
         session.save(student);
         session.save(student2);
         
         System.out.println("Saved");
         
         session.getTransaction().commit();
    }
}
