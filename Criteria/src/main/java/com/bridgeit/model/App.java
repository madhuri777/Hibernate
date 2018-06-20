package com.bridgeit.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings({ "deprecation", "unchecked" })
	public static void main( String[] args )
    {
       Session session=HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       
       //Get All Employee
       Criteria criteria=session.createCriteria(Employee.class);
       List<Employee> emplist=criteria.list();
       for(Employee emp:emplist) {
    	   System.out.println("Details "+emp.getEmp_id()+" "+emp.getEmp_name());
       }
       
       //get with id
      // Criteria criteria2=session.createCriteria(Employee.class);
       criteria.add(Restrictions.eq("emp_name", "mayur"));
       Employee employee=(Employee) criteria.uniqueResult();
       System.out.println("detais 2 "+employee.getEmp_id()+" "+employee.getEmp_name());
       
       //pagination
      // Criteria criteria2=session;
        emplist=session.createCriteria(Employee.class).addOrder(Order.desc("id")).setFirstResult(1).setMaxResults(3).list();
        for(Employee employee2:emplist) {
        	System.out.println("Pagination "+employee2.getEmp_id()+" "+employee2.getEmp_name());
        }
        
       
       session.getTransaction().commit();
    }
}
