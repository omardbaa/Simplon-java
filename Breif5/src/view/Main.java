package view;

import java.sql.SQLException;

import brief5.domain.Candidat;
import brief5.model.dao.Implement.CandidatDao;

public class Main {

	public static void main(String[] args) {
	CandidatDao candidatDao = new CandidatDao();
	//Candidat candidat = new Candidat(15,"LATIFA","AMOUGUAY","Latifa.amouguay@gmail.com","111abc","Maroc-Agadir","Agadir","Maroc");
	/* System.out.print(candidatDao.createCandidat(candidat)); */
	//Candidat candida1 = new Candidat(11,"MOSTAPHA","IHOUM","Mustapha.ihoum@gmail.com","111abc","Maroc-Agadir","Agadir","Maroc");
	//System.out.print(candidatDao.createCandidat(candida1));

	System.out.println("ooooooooooo");
//	Candidat cand = candidatDao.getById(99);
	
	System.out.println("----");
	
	candidatDao.delete(11);
	
	System.out.println("supprimee");
	
	}
	
	
	
	
	
	
	/*public static void main1(String[] args)  {

		CandidatDao candidatDao = new CandidatDao();
		System.out.println("ooooooooooo");
		Candidat cand = candidatDao.getById(2);
		
		System.out.println(cand);
		
		candidatDao.delete(cand);
		
		System.out.println("supprimee");
		
	}*/

}

	
	
	
	
