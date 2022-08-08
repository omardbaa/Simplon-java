package GestionEmploye;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import GestionEmploye.dao.AdminDao;
import GestionEmploye.dao.EmployeeDao;
import GestionEmploye.model.Admin;
import GestionEmploye.model.Employe;
import GestionEmploye.security.entities.AppUser;
import GestionEmploye.security.repositories.AppUserRepositroy;
import GestionEmploye.security.service.SecurityService;



@SpringBootApplication
public class Brief11Application  implements CommandLineRunner{

	
	@Autowired
	private EmployeeDao employeDao;
//	private AdminDao adminDao;
	//private AppUserRepositroy appUserRepositroy;
	
	public static void main(String[] args) {
		SpringApplication.run(Brief11Application.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
//		employeDao.save( new Employe(1L,"omar", "dbaa", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(2L,"Khadija", "BIGDADE", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(3L,"Nawan", "BV Sobape", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(4L,"Abderrahim", "Elouardy", new Date(28-04-2022), "Developer "));
//		employeDao.save( new Employe(5L,"Anas", "Elmakhloufi", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(6L,"Fatiha", "Elhabti", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(7L,"Mohamed", "Idlmhor", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(8L,"Ayoub", "Oudor", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(9L,"Najib", "Rachid ", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(10L,"Ibtihal", "Boukhanchouch", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(11L,"Maryam", "Ziane", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(12L,"Mustapha", "houm", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(13L,"Balde", "Sény", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(14L,"Khalil", "Farouqi", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(15L,"Atman ", "Boulaajaili ", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(16L,"Latifa", "Amougay ", new Date(8-04-2022), "Developer "));
//		employeDao.save( new Employe(16L,"Anas", "Oussous  ", new Date(8-04-2022), "Developer "));
//	adminDao.save(new Admin(1L, "omar dbaa", "omar@gmail.com", "omar"));
//	
		//appUserRepositroy.save(new AppUser());
	employeDao.findAll().forEach(p->{
		
		System.out.println(p.toString());
	});
//	System.out.println("##############");
//	Employe employe=employeDao.findById(2L).get();
//	System.out.println(employe.getNom());
//   employeDao.deleteById(1L);
	
	
	
	}
	
@Bean
CommandLineRunner saveUser(SecurityService securityService) {
	
	return args ->{
//		securityService.saveNewUser("Omar", "123", "123");
//		securityService.saveNewUser("user1", "123", "123");
//		securityService.saveNewUser("user2", "123", "123");
		
//		
//		securityService.saveNewRole("USER", "");
//		securityService.saveNewRole("ADMIN", "");
//		
//		securityService.addRoleToUser("Omar", "USER");
//		securityService.addRoleToUser("Omar", "ADMIN");
//		securityService.addRoleToUser("user1", "USER");
//		securityService.addRoleToUser("user2", "USER");
//		
		
	};
}
}
