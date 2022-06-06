package domain.dao;


import java.sql.Connection;
import java.util.List;

import domain.Users;
import model.DB.DB;


public interface UsersDAO {

	public 	Connection Connect=DB.getConnection();
	
	

	public interface StudentDao {
	   public List<Users> getAllUsers();
	   public Users getUser(int UserId);
	   public void updateUser(Users user);
	   public void deleteUser(Users user);
	}
	
	
	
	
}
