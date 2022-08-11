package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 private static final SessionFactory sessionFactory;
	 static
	 {
	  try
	  {
	   sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  }
	  catch(Exception e){
	   System.err.println("Enitial SessionFactory creation failed"+e);
	   throw new ExceptionInInitializerError(e);
	  }
	   }
	   public static SessionFactory getSessionFactory(){
	    return sessionFactory;
	   }
}