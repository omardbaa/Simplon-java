package stcManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stcManager.model.Exercice;
import stcManager.model.services.ExerciceServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/Exercice")
public class ExerciceController {
	@Autowired
	ExerciceServiceImpl service;
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to stcManger<h1>");
	}
	
	@PostMapping("/admin/save")
public Exercice save(@RequestBody Exercice exercice  ) {
		service.saveOrUpdate(exercice);
		return exercice;
	}
	
	
	@GetMapping("/participent/exercices")
	public List<Exercice> list(){
		return service.getAll();
		
	}
	
	
	@GetMapping("/participent/exercice/{id}")
	
	public Exercice findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

	
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return "Deleted Succesfully id= " +id;
		
	}
}
