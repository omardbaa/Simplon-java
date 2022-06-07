package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect  {

		 public static String driver =  "org.postgresql.Driver";
		 public static String url = "jdbc:postgresql://localhost:5432/ProductManag";
		 public static String user = "postgres";
		 public static String password = "##@Dby3mr@@#!";
		 public static Connection Connect;
		
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

			public static void closePreparedStatement(PreparedStatement ps) {
				// TODO Auto-generated method stub
				
			}

			public static void closeConnection(Connection con) {
				// TODO Auto-generated method stub
				
			}

}
