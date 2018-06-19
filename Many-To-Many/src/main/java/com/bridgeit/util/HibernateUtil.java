package com.bridgeit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static final SessionFactory sessionFctory;
	static {
		try {
			sessionFctory=new Configuration().configure().buildSessionFactory();
			System.out.println("try block "+sessionFctory);
		}catch(Throwable exp) {
			System.out.println("try cach block");
			throw new ExceptionInInitializerError(exp);
			}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFctory;
	}
}
