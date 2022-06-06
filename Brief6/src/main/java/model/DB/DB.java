package model.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	
		 public static String jdbcURL = "jdbc:postgresql://localhost:5432/ProductsMang";
		 public static String username = "postgres";
		 public static String password = "##@Dby3mr@@#!";
		 public static Connection Connect;
		
			
		
		

		 public static Connection getInstance() throws ClassNotFoundException { 
			
			if(Connect == null){
			try {
				
				Connect = DriverManager.getConnection(jdbcURL, username, password);
				System.out.println("Connected to PostgreSQL server");
				
			} catch (SQLException e) {
				System.out.println("Connected to Data Base");
				e.printStackTrace();
				
			}
		
			}
			return Connect;





			
}

}
