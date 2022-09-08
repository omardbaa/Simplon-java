
package stcManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import stcManager.repositories.ActiviteRepository;
import stcManager.repositories.ExerciceRepository;
import stcManager.repositories.ParticipentRepository;
import stcManager.repositories.ResponsableRepository;
import stcManager.security.service.SecurityService;

@SpringBootApplication
//@EnableGlobalMethodSecurity(prePostEnabled =true, securedEnabled = true)
public class StcManagerApplication implements CommandLineRunner{

	@Autowired
	private ResponsableRepository responsableRepository;
	private ParticipentRepository participentRepository;
	private ActiviteRepository activiteRepository;
	private ExerciceRepository exerciceRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(StcManagerApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
			
	}
	
		
//		@Bean
		CommandLineRunner saveUser(SecurityService securityService) {

			return args ->{
				securityService.saveNewUser("Omar", "123", "omar@gmail.com", "123", true);
				securityService.saveNewUser("admin", "password", "omar@gmail.com", "password", true);
				securityService.saveNewUser("Ayoub", "123", "ayoub@gmail.com", "123", true);
				securityService.saveNewUser("Seny", "123","seny@gmail.com", "123", true);
				
				securityService.saveNewUser("participent1", "123","participent1@gmail.com", "123", true);
				securityService.saveNewUser("participent2", "123","participent2@gmail.com", "123", true);
				securityService.saveNewUser("participent3", "123","participent3@gmail.com", "123", true);
				securityService.saveNewUser("participent4", "123","participent4@gmail.com", "123", true);
				securityService.saveNewUser("participent5", "123","participent5@gmail.com", "123", true);
				securityService.saveNewUser("participent6", "123","participent6@gmail.com", "123", true);
				securityService.saveNewUser("participent7", "123","participent7@gmail.com", "123", true);
				securityService.saveNewUser("participent8", "123","participent8@gmail.com", "123", true);
				securityService.saveNewUser("participent9", "123","participent9@gmail.com", "123", true);
				securityService.saveNewUser("participent10", "123","participent10@gmail.com", "123", true);
				
				
				
				securityService.saveNewRole("ADMIN");
				securityService.saveNewRole("RESPONSABLE");
				securityService.saveNewRole("PARTICIPENT");
				
				
				securityService.addRoleToUser("Omar", "PARTICIPENT");
				securityService.addRoleToUser("Omar", "ADMIN");
				securityService.addRoleToUser("Omar", "RESPONSABLE");
				securityService.addRoleToUser("admin", "PARTICIPENT");
				securityService.addRoleToUser("admin", "ADMIN");
				securityService.addRoleToUser("admin", "RESPONSABLE");
				securityService.addRoleToUser("Ayoub", "RESPONSABLE");
				securityService.addRoleToUser("Ayoub", "PARTICIPENT");
				securityService.addRoleToUser("Seny", "RESPONSABLE");
				securityService.addRoleToUser("Seny", "PARTICIPENT");
				
				
				securityService.addRoleToUser("participent1", "PARTICIPENT");
				securityService.addRoleToUser("participent2", "PARTICIPENT");
				securityService.addRoleToUser("participent3", "PARTICIPENT");
				securityService.addRoleToUser("participent4", "PARTICIPENT");
				securityService.addRoleToUser("participent5", "PARTICIPENT");
				securityService.addRoleToUser("participent6", "PARTICIPENT");
				securityService.addRoleToUser("participent7", "PARTICIPENT");
				securityService.addRoleToUser("participent8", "PARTICIPENT");
				securityService.addRoleToUser("participent9", "PARTICIPENT");
				securityService.addRoleToUser("participent10", "PARTICIPENT");
				
				
				
			};	
		
}
	

}
