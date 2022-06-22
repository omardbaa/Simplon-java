package view;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import model.Categories;
import model.Task;
import model.dao.TaskDAO;





public class Main {

	public static void main(String[] args) throws SQLException {
		
		  TaskDAO taskDao = new TaskDAO();


			
			//	================	Task   	================
		
			
			
		  	
			
			//creat
		
//		  	Task task = new Task("Brief9","In this task You need to creat a task manger that allow you to creat,update,select and delte tasks","Active", "2022-06-20", "Briefs");	
//			System.out.println(taskDao.create(task));
		
				
			
			//Read
			
			//int userId=0;
			//Scanner reader = new Scanner(System.in);
			
//			
//			System.out.println("Enter User Id: ");  ---
//            userId= reader.nextInt();
//            System.out.println("User Doesnt Exist!");
//            if(userDao.getById(userId)) {
//            System.out.println("User Found SuccessFuly!");
//            System.out.println(userDao.getById(userId));
//            
//	
//            while(!userDao.getById(userId));
	 

            
//			  
//			  System.out.println("----");
			  
			  
			/*
			 * System.out.println(userDao.getAll());
			 */
			
			//Update
			
//	Task update = new Task ("Show","tray to update","Active", "2022-06-20", "Presentation");{
//    System.out.println(taskDao.update("Brief9", update)); 
//   
//    System.out.println(taskDao.read("Brief9"));
//		
//}
	
	
//	Delete

	 Task task = new Task("Show");
	 System.out.println(taskDao.delete(task));
            
            
            
            
            

    			
    				
    			
    			//Read
    			
//	int productId=0;
//	Scanner reader = new Scanner(System.in);
//	
//	
//	System.out.println("Enter Product Id: ");
//	productId= reader.nextInt();
//    System.out.println("Product Doesnt Exist!");
//    if(productDao.getById(productId)) {
//    System.out.println("Product Found SuccessFuly!");
//    System.out.println(productDao.getById(productId));
//    
//
//    while(!productDao.getById(productId));

                
//    			  
//    			  System.out.println("----");
    			  
    			  
    			/*
    			 * System.out.println(productDao.getAll());
    			 */
    			
    			//Update
    			
//    	Product update = new Product(1,"Orange","Fruits",100,1);{
//        try {
//			System.out.println(productDao.update(1, update));
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		} 
//       
       // System.out.println(productDao.read(1));
//    		
//    }
    	
    	
//    	Delete

    	  
//    	  System.out.println(productDao.delete(1));
                
            
            
            
            
	  

//				================  Categories  	================
            
			//create
			
//			Categories category = new Categories(2,"Vegetables");
//	
//			try {
//				System.out.println(categoryDao.create(category));
//			} catch (SQLException e) {
//			
//				e.printStackTrace();
//			}
			
				
			
			//Read
			
//int categoryId=0;
//Scanner reader = new Scanner(System.in);
//
//
//System.out.println("Enter Category Id: ");
//categoryId= reader.nextInt();
//System.out.println("Category Doesnt Exist!");
//if(categoryDao.getById(categoryId)) {
//System.out.println("Category Found SuccessFuly!");
//System.out.println(categoryDao.getById(categoryId));
//
//
//while(!categoryDao.getById(categoryId));

            
//			  
//			  System.out.println("----");
			  
			  
			/*
			 * System.out.println(categoryDao.getAll());
			 */
			
			//Update
			
//	Ctegories update = new Product(1,"Fruits");{
//    System.out.println(categoryDao.update(1, update)); 
//   
//    System.out.println(categoryDao.read(1));
//		
//}
	
	
//	Delete

	  
//	  System.out.println(categoryDao.delete(1));
            
        
        
}


}

