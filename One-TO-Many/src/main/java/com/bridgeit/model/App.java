package com.bridgeit.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.bridgeit.hibernateutil.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("hello");
       Session session=HibernateUtil.gteSessionFcatory().openSession();
       System.out.println("session object "+session);
       
       session.beginTransaction();
       
       Phone phone=new Phone();
       Phone phone2=new Phone();
       phone.setPhone_type("house");
       phone.setPhoneNumber(25162691);
       phone2.setPhone_type("PersonalNumber");
       phone2.setPhoneNumber(998877655);
       
       Set<Phone> phone_number=new HashSet<Phone>();
       phone_number.add(phone);
       phone_number.add(phone2);
       
       Student student=new Student();
       student.setName("Madhuri");
       student.setStudentPhoneNumber(phone_number);
       
       session.save(student);
       System.out.println("Added Successfully");
       session.getTransaction().commit();
       
    }
}
