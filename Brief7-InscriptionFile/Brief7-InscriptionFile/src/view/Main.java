package view;
import java.sql.SQLException;


import dao.CandidatDAO;
import domain.Candidat;
public class Main {

	public static void main(String[] args) throws SQLException {
		
		  CandidatDAO candidatDao = new CandidatDAO();
		  
		
			//	================	Candidat   	================
		
			
//			create
			
//			Candidat candidat = new Candidat(5,"MARYAM","ZIANE","MERYAM.ZIYANE@gmail.com", "Tilila-Agadir","Agadir","Maroc");
//			System.out.println(candidatDao.create(candidat));
			
				
			
			//Read
			
			int candidatId=0;
			//Scanner reader = new Scanner(System.in);
			
//			
//			System.out.println("Enter Candidate Id: ");
//            IdCandidat= reader.nextInt();
//            System.out.println("Candidate Doesn't Exist!");
//            if(candidatDao.getById(IdCandidat)) {
//            System.out.println("Candidate Found SuccessFuly!");
//            System.out.println(candidatDao.getById(IdCandidat));
//            
//	
//            while(!candidatDao.getById(IdCandidat));
	 

            
//			  
//			  System.out.println("----");
			  
			  
			/*
			 * System.out.println(candidatDao.getAll());
			 */
			
			//Update
			
	Candidat update = new Candidat(3,"Najib","Rachid","Najib.Rachid@gmail.com","Tilila-agadir ", "Agadir","Maroc");{
    System.out.println(candidatDao.update(1, update)); 
   
   // System.out.println(candidatDao.read(1));
		
}
	
	
//	Delete

	  
//	  System.out.println(candidatDao.delete(6));
            
       
        
        
}


}
