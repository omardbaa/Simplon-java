package view;

import java.sql.Connection;
import java.sql.DriverManager;
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

}
