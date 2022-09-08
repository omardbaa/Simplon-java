package stcManager;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import stcManager.model.Activite;
import stcManager.model.Exercice;
import stcManager.model.Participent;
import stcManager.model.Responsable;
import stcManager.model.services.ActiviteServiceImpl;
import stcManager.model.services.ExerciceServiceImpl;
import stcManager.model.services.ParticipentServiceImpl;
import stcManager.model.services.ResponsableServiceImpl;

@SpringBootTest
class StcManagerApplicationTests {
	
	
	@Autowired
	ActiviteServiceImpl activiteService;

	@Autowired
	ExerciceServiceImpl exerciceService;
	
	@Autowired
	ResponsableServiceImpl responsableService;
	
	@Autowired
	ParticipentServiceImpl participentService;
	
	
	
	//Test Create
	@Test
	void testCreatActivite() {
		
		Activite activite = new Activite();
				activite.setActiviteId(2L);
				activite.setTitreActivite("java interview");
				activite.setDescriptif("recruting day");
				activite.setType("interview");
				activite.setDateDebut(new Date (2022-9-10));
				activite.setDateFin(new Date (2022-9-15));
				activite.setActive(true);
				activiteService.saveOrUpdate(activite);
	}
	
	@Test
	void testCreatExercice() {
		Exercice exercice = new Exercice();
		exercice.setRefExercice(3L);
		exercice.setAnnee(new Date(2023));
		exercice.setDateDebut(new Date (2022-9-1));
		exercice.setDateFin(new Date (2022-9-30));
		exercice.setStatut("on progress");
		
	}
	
	
	
	
	
	
	//********************************************
	// ######## test get all ########
	
	//Actvite
	@Test
	void testGetAllActiivits() {
	List<Activite>list = activiteService.getAll();
	}
	
	//Exercice
	@Test
	void testGetAllExercices() {
		List<Exercice>list = exerciceService.getAll();
	}
	
	//Responable
	@Test
	void testGetAllResponsables() {
		List<Responsable>list = responsableService.getAll();
	}
	
	//Particpent
	@Test
	void testGetAllParticipentss() {
		List<Participent>list = participentService.getAll();
	}
	
	//********************************************
	//########  get by id  ######
	
	//Activite
	@Test
	void testActiviteFindById() {
	 activiteService.findById(1L);
	}
	
	//Exercice
	
	@Test
	void testExerciceFindById() {
		exerciceService.findById(1L);
	}
	
	//Responsable
	@Test
	void testResponsableFindById() {
		responsableService.findById(1L);
	}
	
	//Participent
	@Test
	void testParticipentFindById() {
		participentService.findById(1L);
	}
	
	
	
//	@Test 
//	void TestDeleteActivite() {
//		activiteService.delete(7L);
//	}
//	
	@Test  
	void TestUpdateActivite() {
		
		Activite activite = new Activite();
		activite = activiteService.findById(1L);
		activite.setTitreActivite("deploye app");
		activite.setActive(false);
		activiteService.saveOrUpdate(activite);
	}
	
	
	}



