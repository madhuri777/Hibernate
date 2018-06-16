package com.bridgeit.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory= new Configuration().configure().buildSessionFactory();
			System.out.println("try "+sessionFactory);
		}catch(Throwable expn) {
			System.out.println();
			throw new ExceptionInInitializerError(expn);
		}
	}
	public static SessionFactory getSessionFactory() {
		System.out.println("get Method "+sessionFactory);
		return sessionFactory;
	}
}
