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
//		employeDao.save( new Employe(1L,"Said", "Said", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(2L,"Khadija", "BIGDADE", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(3L,"Nawan", "BV Sobape", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(4L,"Abderrahime", "Elouardy", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(5L,"Anass", "Anass", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(6L,"Khadija", "BIGDADE", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(7L,"Nawan", "BV Sobape", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(8L,"Abderrahime", "Elouardy", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(9L,"Najib", "Najib", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(10L,"Khadija", "BIGDADE", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(11L,"Nawan", "BV Sobape", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(12L,"Abderrahime", "Elouardy", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(13L,"Ibtihal", "Ibtihal", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(14L,"Khadija", "BIGDADE", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(15L,"Nawan", "BV Sobape", new Date(2022-8-04), "Responsabe "));
//		employeDao.save( new Employe(16L,"Abderrahime", "Elouardy", new Date(2022-8-04), "Responsabe "));
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
