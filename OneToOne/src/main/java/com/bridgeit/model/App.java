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
       
       Account account=new Account();
       account.setAcct_Id(101);
       account.setAcct_Number("SBI/4849203");
       
       Employee emp=new Employee();
       emp.setEmp_id(12);
       emp.setEmp_fname("Madhuri");
       emp.setEmp_lname("satkar");
       emp.setAccount_no(account);
       
       session.save(emp);
       System.out.println("added");
       session.getTransaction().commit();
    }
}
