package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.Admin;
import entities.Cours;
import entities.Students;
import entities.Teachers;
import utils.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// create new Teacher
		Teachers  teacher1= new Teachers();
		teacher1.setFirtsName("Liela");
		teacher1.setLastName("M'haidrat");
		session.save(teacher1);
		System.out.println("Inserted professor Successfully");
		//session.getTransaction().commit();
		
		Teachers teacher2 = new Teachers();
		teacher2.setFirtsName("Hanae");
		teacher2.setLastName("Elouahabi");
		session.save(teacher2);
		System.out.println("Inserted professor Successfully");
		
		
		//session.getTransaction().commit();
		
		
		// create new  Admin
		Admin admin = new Admin();
		admin.setUsername("omar");
		admin.setPassword("123");
		admin.setEmail("omar@gmail.com");
		session.save(admin);
		System.out.println("Inserted admin Successfully");
		//session.getTransaction().commit();

		// create new cours
		Cours cours1 = new Cours();
		cours1.setCoursName("OOP");
		cours1.setTeacherName(teacher2);
		session.save(cours1);
		System.out.println("Inserted course Successfully");
		
		Cours cours2 = new Cours();
		cours2.setCoursName("JAVA Web");
		cours2.setTeacherName(teacher1);
		session.save(cours2);
		System.out.println("Inserted course Successfully");
		//session.getTransaction().commit();
		
		;
		
		
		// create new student
		Students students[] = new Students[5];
		students[0] = new Students(0, "omar","Dbaa", null);
		students[1] = new Students(1, "Soubape","Nawan", null);
		students[2] = new Students(2, "Abderrahim","Elouardy", null);
		students[3] = new Students(3, "Khadija","Bigdade", null);
		students[4] = new Students(4, "Ayoub","Oudor", null);
		session.save(students[0]);
		session.save(students[1]);
		session.save(students[2]);
		session.save(students[3]);
		session.save(students[4]);
		session.getTransaction().commit();
		session.close();
	}

}
