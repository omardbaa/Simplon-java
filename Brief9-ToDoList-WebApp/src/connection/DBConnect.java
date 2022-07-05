package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect  {

		 public static String driver =  "org.postgresql.Driver";
		 public static String url = "jdbc:postgresql://localhost:5432/ToDoListWeb";
		 public static String user = "postgres";
		 public static String password = "##@Dby3mr@@#!";
		 public static Connection Connect;
		
		 
		 
	        // query
	        String query = "INSERT INTO Userr(FirstName, LastName, UserName, PassWord) VALUES(?, ?, ?, ?)";
			 public static Connection getInstance() {
				 
				 try{ 
			         Class.forName(driver);
					 return DriverManager.getConnection(url, user, password );

				 }catch(SQLException | ClassNotFoundException e){
					 e.printStackTrace();
			         System.out.println("Error Opning DB!");
					 
				 }
				 return null;
			 }

			public static Connection getConnection() {
				// TODO Auto-generated method stub
				return null;
			}

			public static void closeResultSet(ResultSet rs) {
				// TODO Auto-generated method stub
				
			}

			public static void closePreparedStatement(PreparedStatement stmt) {
				// TODO Auto-generated method stub
				
			}

			public static void closeConnection(Connection con) {
				// TODO Auto-generated method stub
				
			}

			public Statement createStatement() {
				// TODO Auto-generated method stub
				return null;
			}

			/*public static void writeToDatabase(String UserName, String PassWord) {
				// TODO Auto-generated method stub
				
			}*/

}




