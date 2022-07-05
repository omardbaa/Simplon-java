package model.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import model.Task;


public class TaskDAO implements DAO<Task> {	
	
	



		
		//CREAT TasK
		@Override
		public boolean create(Task task) throws SQLException {
			String sql = "INSERT INTO Task (Title, Description , Status, Deadline, Category) VALUES (?, ?, ?, ?::Date, ?)";
			
			PreparedStatement ps = Connect.prepareStatement(sql);
			
	     	            ps.setString(1, task.getTitle());
						ps.setString(2, task.getDescription());
						ps.setString(3, task.getStatus());
						ps.setString(4, task.getDeadline());
						ps.setString(5, task.getCategory());
					
		int result = ps.executeUpdate();
		
		if(result == 1) {
			return  true;
		}
			
						DBConnect.closePreparedStatement(ps);
						DBConnect.closeConnection(Connect);
						
			return false;
			
		}
		
		//Read

		@Override
	public List<Task> selectAll() {
			List<Task> ListerTasks = new ArrayList<>();
		try {
			String sql = "SELECT *  FROM Task";
			Statement stmt = Connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Task task = new Task();
				task.setTitle(rs.getString("Title"));
				task.setDescription(rs.getString("Description"));
				task.setStatus(rs.getString("Status"));
				task.setDeadline(rs.getString("Deadline"));
				task.setCategory(rs.getString("Category"));

				ListerTasks.add(task);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return ListerTasks;
		}


@Override

	public boolean select(Task Title) {
		boolean status=false;
			
			try {
				Statement stmt = Connect.createStatement();
		
		
			System.out.println(Title);
			ResultSet rs = stmt.executeQuery("SELECT *FROM Task WHERE Title ="+ Title);
				 if (rs.next()) {
						

					return true;
				 }
				 
			}catch (Exception e) {
				e.printStackTrace();
			}

		

			return status;
		}
	
	
    //Update
		@Override
		public boolean update(Task  task) throws SQLException {
			

	
				String sql = "UPDATE Task set Title = ?, Description = ?, Status = ?, Deadline = ?::Date, Category = ?  where Title ='" + task.getTitle() +"'";
				
				PreparedStatement ps = Connect.prepareStatement(sql);
				
				
 	            ps.setString(1, task.getTitle());
				ps.setString(2, task.getDescription());
				ps.setString(3, task.getStatus());
				ps.setString(4, task.getDeadline());
				ps.setString(5, task.getCategory());
				//ps.setString(6, task);
				int result = ps.executeUpdate();

				
				if(result == 1) {
					return  true;
				}
					
								DBConnect.closePreparedStatement(ps);
								DBConnect.closeConnection(Connect);
								
					return false;
					
				}
	

	//Delete
	
		
		
		
		
		
		@Override
		 public boolean delete(Task task) {

		    try {
		        Statement stmt = Connect.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM Task WHERE Title='" + task.getTitle() +"'");

		      if(i == 1) {
		        return true;
		      }
			    stmt.close();
			    Connect.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return false;
		}

	

}
