package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import view.DBConnect;


	public interface DAO<T> {
		 public Connection connect = DBConnect.getInstance() ;
		 
			List<T> getAll();


		    public  T read(int id);
		    		   

		    public  boolean  create(T obj) throws SQLException;
		    

			boolean update(int id, T obj) throws SQLException;

		    
		    public boolean delete(int id);
		    
	}

