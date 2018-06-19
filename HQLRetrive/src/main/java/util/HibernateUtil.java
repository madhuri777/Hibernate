package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private static final SessionFactory sessionFactory=sessionFactoryMethod();
	
	private static SessionFactory sessionFactoryMethod() {
			try {
				System.out.println("jhfdghd "+sessionFactory);
				return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				
			}catch(Throwable exp) {
				System.err.println("Initial creation of sessionFactory failed "+exp);
				throw new ExceptionInInitializerError(exp);
			}
		
	}
	
	public  static SessionFactory getSessionFactory() {
		System.out.println("sjdjsd "+sessionFactory);
		return sessionFactory;
	}
}
