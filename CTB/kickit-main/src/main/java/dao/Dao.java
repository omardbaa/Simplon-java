package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

import db.DbConnection;

public interface Dao<T> {
	public Connection Connect = DbConnection.getInstance();
	  Set<T> getAll();
	  T getOne(int id);
	  public  boolean  create(T obj) throws SQLException;
	  boolean update(int id, T item);
	  boolean delete(int id);   
	  
}
