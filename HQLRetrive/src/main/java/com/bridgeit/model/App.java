package com.bridgeit.model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;

import org.hibernate.Session;
import util.HibernateUtil;
/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
		Session session=HibernateUtil.getSessionFactory().openSession();
		//session.beginTransaction();
		System.out.println("Enter the operation");
		int n=scanner.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Enter the Employee Datails:");
			session.beginTransaction();
			Employee employee=new Employee();
			
			//System.out.println("Enter employee id ");
			//int id=scanner.nextInt();	
			//employee.setEmp_id(id);
			System.out.println("Enter Name of EMployee: ");
			String name=scanner.next();
			employee.setEmp_name(name);
			
			Address address=new Address();
			//System.out.println("Enter the id for address");
			//int Add_id=scanner.nextInt();
			//address.setId(Add_id);
			System.out.println("Enter the City");
			String city=scanner.next();
			address.setCity(city);
			System.out.println("Enter the state");
			String state=scanner.next();
			address.setState(state);
			//address.setZipcode(400084);
			
			employee.setEmp_add(address);
			session.save(address);
			session.save(employee);
			session.getTransaction().commit();
			System.out.println("added succesfully");
			break;
		case 2:
			System.out.println("Retrive the data from table");
			
			session.beginTransaction();
			
			Query query=session.createQuery("from Employee");
			List<Employee> empList=query.list();
			
			for(Employee emp:empList) {
				System.out.println("List ofEmployee "+emp.getEmp_id()+" "+emp.getEmp_name()+" "+emp.getEmp_add());
			}
			session.getTransaction().commit();
			break;
			
		case 3:
			System.out.println("Delet Operation ");
			
			session.beginTransaction();
			
			Query querydelete=session.createQuery("delete Employee where Emp_id=:emp_id ");
			
			System.out.println("Enter the id of employee to delete record ");
			int empid=scanner.nextInt();
			querydelete.setParameter("emp_id",empid );
			int result=querydelete.executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Deleted Record Successfully");
			
			break;
		case 4:
			break;
		}
		
	}
    
}
