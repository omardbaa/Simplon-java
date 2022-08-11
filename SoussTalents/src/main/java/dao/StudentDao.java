package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.Students;
import utils.HibernateUtil;

public class StudentDao implements Dao<Students> {

	@Override
	public void add(Students obj) {
		//Create student entity object
		  Students student = new Students();
		  student.setFirstName("");
		  student.setLastName("");
		  student.getCours();
		  
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(student);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();
		
	}

	@Override
	public void update(Students obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Students> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Students getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}


}
