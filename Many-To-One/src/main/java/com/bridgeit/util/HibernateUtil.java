package com.bridgeit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}catch(Throwable e) {
			System.out.println("catch block");
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		System.out.println("getMethod");
		return sessionFactory;
	}
}
