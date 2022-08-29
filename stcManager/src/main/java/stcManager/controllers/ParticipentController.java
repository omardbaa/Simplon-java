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

import stcManager.model.Participent;

import stcManager.model.services.ParticipentServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/Participent")
public class ParticipentController {
	@Autowired
	ParticipentServiceImpl service;
	
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to stcManger<h1>");
		
		
	}
	
	@PostMapping("/admin/save")
public Participent save(@RequestBody Participent participent  ) {
		service.saveOrUpdate(participent);
		return participent;
	}
	
	
	@GetMapping("/responsable/participents")
	public List<Participent> list(){
		return service.getAll();
		
	}
	
	
	@GetMapping("/responsable/participent/{id}")
	
	public Participent findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

	
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return "Deleted Succesfully id= " +id;
		
	}
}
