package view;

import java.sql.SQLException;

import brief5.domain.Candidat;
import brief5.model.dao.Implement.CandidatDao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		CandidatDao candidatDao = new CandidatDao();

		// creat

		// Candidat candidat = new
		// Candidat(15,"LATIFA","AMOUGUAY","Latifa.amouguay@gmail.com","111abc","Maroc-Agadir","Agadir","Maroc");
		/* System.out.print(candidatDao.createCandidat(candidat)); */
		// Candidat candida1 = new
		// Candidat(11,"MOSTAPHA","IHOUM","Mustapha.ihoum@gmail.com","111abc","Maroc-Agadir","Agadir","Maroc");
		// System.out.print(candidatDao.createCandidat(candida1));

		// delete Candidat
		/*
		 
		 * delete System.out.println("ooooooooooo"); // Candidat cand =
		 * candidatDao.getById(99);
		 * 
		 * 
		 * System.out.println("----");
		 * 
		 * candidatDao.delete(4);
		 * 
		 * System.out.println("supprimee");
		 * 
		 */

		
		  Candidat candid = new Candidat(5,"MOHAMED","Mohamed","mohamed.mohamed",
		  "111abc","Maroc-Agadir","Agadir","Maroc");
		  
		  try { candidatDao.update(candid); } catch (SQLException e) {
		  
		  e.printStackTrace(); }
		  
		  System.out.println(candid);
		  
		 
		  
		 

	}

}
