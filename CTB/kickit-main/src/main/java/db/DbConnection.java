package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	 public static String driver =  "org.postgresql.Driver";
	 public static String url = "jdbc:postgresql://localhost:5432/DBQuestions";
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

	public static void closePreparedStatement(PreparedStatement ps) {
		// TODO Auto-generated method stub
		
	}

	public static void closeConnection(Connection connect) {
		// TODO Auto-generated method stub
		
	}

   
}
