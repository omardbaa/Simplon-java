package model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import model.User;

public  class UserDAO  implements DAO<User>{
	
	
	
	
	private static final String UserName = null;



		
		
		//CREAT User
		@Override
		public boolean create(User user) throws SQLException {
			String sql = "INSERT INTO Userr (FirstName, LastName, UserName, PassWord) VALUES (?, ?, ?, ?)";
			
			PreparedStatement ps = Connect.prepareStatement(sql);
			
						ps.setString(1, user.getFirstName());
						ps.setString(2, user.getLastName());
						ps.setString(3, user.getUserName());
						ps.setString(4, user.getPassWord());
						
		  
						
				
			
		int result = ps.executeUpdate();
		
		if(result == 1) {
			return  true;
		}
			
						DBConnect.closePreparedStatement(ps);
						DBConnect.closeConnection(Connect);
						
			return false;
			
		}





		@Override
		public List<User> getAll() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}





		@Override
		public User read(String obj) {
			// TODO Auto-generated method stub
			return null;
		}





		@Override
		public boolean update(User obj) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}





		@Override
		public boolean delete(User obj) {
			// TODO Auto-generated method stub
			return false;
		}

		}

