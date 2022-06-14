package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import connection.DBConnect;


public interface DAO<T>{


	 		public Connection connect = DBConnect.getInstance() ;
		 
			List<T> getAll() throws SQLException;

		    public  boolean  create(T obj) throws SQLException;
		    
		    public  T read(int id);
		    		   

			boolean update(int id, T obj) throws SQLException;

			boolean delete(int id);


		    
	}

