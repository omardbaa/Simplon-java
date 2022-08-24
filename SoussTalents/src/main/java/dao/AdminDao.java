package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.Admin;
import utils.HibernateUtil;


public class AdminDao implements Dao<Admin> {

	@Override
	public void add(Admin admin) {

		  
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(admin);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();
		
	}

	@Override
	public void update(Admin obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}











