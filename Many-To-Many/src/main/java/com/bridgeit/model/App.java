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
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Course course=new Course();
        course.setCourse_id(1);
        course.setCourse_Name("JAVA");
        
        
        Course course2=new Course();
        course2.setCourse_id(2);
        course2.setCourse_Name("AngularJS");
        
        Set<Course> courses=new HashSet<Course>();
        courses.add(course);
        courses.add(course2);
        
        
        Student student=new Student();
        student.setRoll_no(101);
        student.setStudent_Name("Madhuri");
        student.setCourse(courses);
        
         Student student2=new Student();
         student2.setRoll_no(102);
         student2.setStudent_Name("Amruta");
         student2.setCourse(courses);
        
         session.save(student);
         session.save(student2);
         
         System.out.println("Added succesfully");
         
        session.getTransaction().commit();
        session.close();
    }
}
