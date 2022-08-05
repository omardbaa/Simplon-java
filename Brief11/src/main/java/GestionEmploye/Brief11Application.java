package GestionEmploye;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import GestionEmploye.dao.AdminDao;
import GestionEmploye.dao.EmployeeDao;
import GestionEmploye.model.Admin;
import GestionEmploye.model.Employe;



@SpringBootApplication
public class Brief11Application  implements CommandLineRunner{

	
	@Autowired
	private EmployeeDao employeDao;
//	private AdminDao adminDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Brief11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeDao.save( new Employe(1L,"omar", "dbaa", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(2L,"Khadija", "BIGDADE", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(3L,"Nawan", "BV Sobape", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(4L,"Abderrahim", "Elouardy", new Date(28-04-2022), "Developer "));
		employeDao.save( new Employe(5L,"Anas", "Elmakhloufi", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(6L,"Fatiha", "Elhabti", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(7L,"Mohamed", "Idlmhor", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(8L,"Ayoub", "Oudor", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(9L,"Najib", "Rachid ", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(10L,"Ibtihal", "Boukhanchouch", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(11L,"Maryam", "Ziane", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(12L,"Mustapha", "houm", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(13L,"Balde", "Sény", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(14L,"Khalil", "Farouqi", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(15L,"Atman ", "Boulaajaili ", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(16L,"Latifa", "Amougay ", new Date(8-04-2022), "Developer "));
		employeDao.save( new Employe(16L,"Anas", "Oussous  ", new Date(8-04-2022), "Developer "));
//	adminDao.save(new Admin(1L, "omar dbaa", "omar@gmail.com", "omar"));
//	
	employeDao.findAll().forEach(p->{
		
		System.out.println(p.toString());
	});
//	System.out.println("##############");
//	Employe employe=employeDao.findById(2L).get();
//	System.out.println(employe.getNom());
//   employeDao.deleteById(1L);
	
	}

}
