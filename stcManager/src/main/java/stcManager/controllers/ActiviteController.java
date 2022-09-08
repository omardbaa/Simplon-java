package stcManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stcManager.model.Activite;
import stcManager.model.services.ActiviteServiceImpl;
import stcManager.security.jwt.JWTUtility;
import stcManager.security.jwt.UserService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/Activite")
public class ActiviteController {
	@Autowired
	ActiviteServiceImpl service;
	
	
	
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to stcManger<h1>");
	}
	
	
//	@PreAuthorize("ADMIN")
	@PostMapping("/admin/save")
public Activite save(@RequestBody Activite activite  ) {
		service.saveOrUpdate(activite);
		return activite;
	}
	
	
	@GetMapping("/participent/activites")
	public List<Activite> list(){
		return service.getAll();
		
	}
	
	
	@GetMapping("/participent/activite/{id}")
	
	public Activite findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

	
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return "Deleted Succesfully id= " +id;
		
	}
}
