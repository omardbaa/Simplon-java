package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.DAO;
import domain.Product;
import domain.User;
import view.DBConnect;

public  class UserDAOImpl  implements DAO<User>{
	
	
	
	
	private static final int UserId = 0;

	// CRUD - Retrieve
	
//	
//		@Override
//		public User get(int UserId) throws SQLException {
//			Connection con = DBConnect.getConnection();
//			User User = null;
//
//			String sql = "SELECT UserId, FirstName, LastName, Email, City, Country FROM Users WHERE UserId = ?";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setInt(1, UserId);
//
//			ResultSet rs = ps.executeQuery();
//
//			if (rs.next()) {
//				
//				int getUserId = rs.getInt("User_id");
//				String FirstName = rs.getString("FirstName");
//				String LastName = rs.getString("LastName");
//				String Email = rs.getString("Email");
//				String City = rs.getString("City");
//				String Country = rs.getString("Country");
//				
//
//				User = new User(UserId, FirstName, LastName, Email, City, Country);
//			}
//
//			DBConnect.closeResultSet(rs);
//			DBConnect.closePreparedStatement(ps);
//			DBConnect.closeConnection(con);
//
//			return User;
//		}
//
//		// CRUD - Retrieve All
//		
//		@Override
//		public List<User> getAll() throws SQLException {
//
//			Connection con = DBConnect.getConnection();
//			String sql = "SELECT UserId, FirstName, LastName, Email, City, Country  FROM Users";
//
//			List<User> users = new ArrayList<>();
//
//			Statement stmt = con.createStatement();
//
//			ResultSet rs = stmt.executeQuery(sql);
//
//			while (rs.next()) {
//				int UserId = rs.getInt("User_id");
//				String FirstName = rs.getString("FirstName");
//				String LastName = rs.getString("LastName");
//				String Email = rs.getString("Email");
//				String City = rs.getString("City");
//				String Country = rs.getString("Country");
//				
//
//				User user= new User(UserId, FirstName, LastName, Email, City, Country);
//				users.add(user);
//			}
//
//			return users;
//		}
//
//		// CRUD - Create or Update
//		
//		@Override
//		public int saveUser(User user) throws SQLException {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		// CRUD - Create
//
//		@Override
//		public int insertUser(User user) throws SQLException {
//			Connection con = DBConnect.getConnection();
//
//			String sql = "INSERT INTO Users (UserId, FirstName, LastName, Email, City, Country) VALUES (?, ?, ?, ?,?,?)";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setInt(1, user.getUserId());
//			ps.setString(2, user.getFirstName());
//			ps.setString(3, user.getLastName());
//			ps.setString(4, user.getEmail());
//			ps.setString(5, user.getCity());
//			ps.setString(6, user.getCountry());
//			
//
//			int result = ps.executeUpdate();
//
//			DBConnect.closePreparedStatement(ps);
//			DBConnect.closeConnection(con);
//
//			return result;
//		}
//
//		// CRUD - Update
//	
//		@Override
//		public int updateUser(User user) throws SQLException {
//			Connection connection = DBConnect.getConnection();
//
//			String sql = "UPDATE Users set UserId = ?, FirstName = ?, LastName = ?, Email = ?, City = ?, Country = ? where UserId = ?";
//			
//			PreparedStatement ps = connection.prepareStatement(sql);
//			
//			ps.setInt(1, user.getUserId());
//			ps.setString(2, user.getFirstName());
//			ps.setString(3, user.getLastName());
//			ps.setString(4, user.getEmail());
//			ps.setString(5, user.getCity());
//			ps.setString(6, user.getCountry());
//			
//			int result = ps.executeUpdate();
//			
//			DBConnect.closePreparedStatement(ps);
//			DBConnect.closeConnection(connection);
//			
//			return result;
//		}

		@Override
		public User read(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		
		
		//CREAT User
		@Override
		public boolean create(User user) throws SQLException {
			String sql = "INSERT INTO Users (UserId, FirstName, LastName, Email, City, Country) VALUES (?, ?, ?, ?,?,?)";
			
			PreparedStatement ps = connect.prepareStatement(sql);
			
	     	            ps.setInt(1, user.getUserId());
						ps.setString(2, user.getFirstName());
						ps.setString(3, user.getLastName());
						ps.setString(4, user.getEmail());
						ps.setString(5, user.getCity());
						ps.setString(6, user.getCountry());
		  
						
				
			
		int result = ps.executeUpdate();
		
		if(result == 1) {
			return  true;
		}
			
						DBConnect.closePreparedStatement(ps);
						DBConnect.closeConnection(connect);
						
			return false;
			
		}
		
		
		

		@Override
		public boolean update(int id, User user) throws SQLException {
			

	
				String sql = "UPDATE Users set UserId = ?, FirstName = ?, LastName = ?, Email = ?, City = ?, Country = ? where UserId = ?";
				
				PreparedStatement ps = connect.prepareStatement(sql);
				
				ps.setInt(1, user.getUserId());
				ps.setString(2, user.getFirstName());
				ps.setString(3, user.getLastName());
				ps.setString(4, user.getEmail());
				ps.setString(5, user.getCity());
				ps.setString(6, user.getCountry());
				ps.setInt(7, id);
				int result = ps.executeUpdate();

				
				if(result == 1) {
					return  true;
				}
					
								DBConnect.closePreparedStatement(ps);
								DBConnect.closeConnection(connect);
								
					return false;
					
				}
	

		@Override
		public boolean delete(int user) {
				try {
				            
				            this.connect    
				                .createStatement(
				                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
				                    ResultSet.CONCUR_UPDATABLE
				                 ).executeUpdate(
				                    "DELETE FROM User WHERE UserId='"+user.getUserIdl()+"' " 
				                 );
				
				        } catch (SQLException e) {
				                e.printStackTrace();
				     } 
				
				       return false;  
				    }
			
		

		@Override
		public List<User> getAll() {
			// TODO Auto-generated method stub
			return null;
		}



		public void getById(int id) {
			// TODO Auto-generated method stub
			
		}





	
	

}
