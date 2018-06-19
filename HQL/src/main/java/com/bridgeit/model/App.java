package com.bridgeit.model;

import java.util.Scanner;

import org.hibernate.Session;

import com.bridgeit.util.HibernateUtil;

public class App {

	public static void main() {
		Scanner scanner=new Scanner(System.in);
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter the operation");
		int n=scanner.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Enter the Employee Datails:");
			
			Employee employee=new Employee();
			
			System.out.println("Enter employee id ");
			int id=scanner.nextInt();	
			employee.setEmp_id(id);
			System.out.println("Enter Name of EMployee: ");
			String name=scanner.next();
			employee.setEmp_name(name);
			
			Address address=new Address();
			address.setId(1);
			address.setCity("MUMBAI");
			address.setState("MAHRASTARa");
			address.setZipcode(400084);
			
			employee.setEmp_add(address);
			session.getTransaction().commit();
			System.out.println("added succesfully");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
	}
}
