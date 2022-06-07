package view;

import java.sql.SQLException;

import domain.User;
import impl.UserDAOImpl;




public class Main {

	public static void main(String[] args)throws SQLException {
		

			UserDAOImpl userDao = new UserDAOImpl();
			
			
			
			//	User
			//creat
//			User user = new User(1,"OMAR","DBAA","OMAR.DBAA@gmail.com","Agadir","Maroc");
//	
//			System.out.println(userDao.create(user));
//			
			
			
			//Updat
			
	User update = new User(1,"Abderrahim","Elourdi","Abderrahim.Elourdi@gmail.com","Agadir","Maroc");{
    System.out.println(userDao.update(1, update)); 
   
    System.out.println(userDao.read(1));
		
}
	
	
//	Delet

	 
	   System.out.println("ooooooooooo"); 
	  userDao.getById(15);
	  
	  
	  System.out.println("----");
	  
	  
	  
	  System.out.println(userDao.delete(15));
	  


		}
 	
		
		
		/*
		
		for (User user : UserDAOImpl.getAll()) {
			
			System.out.println("User: [UserId:"+ user.getUserId() + ", FirstName:" + user.getFirstName()+ ", LastName:" 
			+ user.getLastName()+ ", Email:" + user.getEmail()+ ", Ciry:" + user.getCity()+ ", Counrty:" + user.getCountry()+" ]");
		}
		
		// creat

		// UserDAOImpl user = new UserDAOImpl()
		// Candidat(15,"LATIFA","AMOUGUAY","Latifa.amouguay@gmail.com","111abc","Maroc-Agadir","Agadir","Maroc");
		 System.out.print(candidatDao.createCandidat(candidat)); */
		// Candidat candida1 = new
		// Candidat(11,"MOSTAPHA","IHOUM","Mustapha.ihoum@gmail.com","111abc","Maroc-Agadir","Agadir","Maroc");
		
//		private static void User(int i, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		
//	}





//		Connection con = DBConnect.getInstance();
	  //		
//	        UserDAOImpl userDao =  new UserDAOImpl();
//	        ProductDAOImpl productDao =  new ProductDAOImpl();
//	        CategoryDAOImpl categoryDao =  new CategoryDAOImpl();

//		System.out.print(123);
//	}

}
