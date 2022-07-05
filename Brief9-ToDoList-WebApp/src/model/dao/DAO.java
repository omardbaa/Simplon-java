package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import connection.DBConnect;


	public interface DAO<T> {
		 public Connection Connect = DBConnect.getInstance() ;
		 
			List<T> selectAll() throws SQLException;

		    public  boolean  create(T obj) throws SQLException;
		    
		    public  boolean select(T obj);
		    		   

			boolean update(T obj) throws SQLException;

			boolean delete(T obj);
			
			
			


		    
	}

