package com.bridgeit.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	
	static final SessionFactory sessionFactory;
	static {
		try {
			 sessionFactory= new Configuration().configure().buildSessionFactory();
			System.out.println("try Method "+sessionFactory);
		}catch(Throwable exp) {
			System.out.println("");
			throw new ExceptionInInitializerError(exp);
		}
	}
	public static SessionFactory gteSessionFcatory() {
		System.out.println("get Method "+sessionFactory);
		return sessionFactory;
	}
}
