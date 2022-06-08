package impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.DAO;
import domain.User;
import view.DBConnect;

public  class UserDAOImpl  implements DAO<User>{
	
	
	
	
	private static final int UserId = 0;


		@Override
		public User read(int id) {


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
		
		//Read

		@Override
	public List<User> getAll() {
			List<User> ListerUsers = new ArrayList<>();
		try {
			String sql = "SELECT *  FROM Users";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("UserId"));
				user.setFirstName(rs.getString("FirstName"));
				user.setLastName(rs.getString("LastName"));
				user.setEmail(rs.getString("Email"));
				user.setCity(rs.getString("City"));
				user.setCountry(rs.getString("Country"));
				ListerUsers.add(user);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return ListerUsers;
		}




	public boolean getById(int id) {
		
			
			try {
				Statement stmt = connect.createStatement();
		
		
			System.out.println(id);
			ResultSet rs = stmt.executeQuery("SELECT *FROM Users WHERE UserId ="+ id);
				 if (rs.next()) {
						

					return true;
				 }
				 
			}catch (Exception e) {
				e.printStackTrace();
			}

		

			return false;
		}
	
	
    //Update
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
	

	//Delete
	
		@Override
		 public boolean delete(int id) {

		    try {
		        Statement stmt = connect.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM Users WHERE UserId=" + id);

		      if(i == 1) {
		        return true;
		      }
			    stmt.close();
			    connect.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return false;
		}	

		

		}

