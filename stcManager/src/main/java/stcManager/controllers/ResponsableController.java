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

import stcManager.model.Responsable;
import stcManager.model.services.ResponsableServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/Responsable")
public class ResponsableController {
	@Autowired
	ResponsableServiceImpl service;
	
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to stcManger<h1>");
	}
	@PostMapping("/admin/save")
public Responsable save(@RequestBody Responsable responsable  ) {
		service.saveOrUpdate(responsable);
		return responsable;
	}
	
	
	@GetMapping("/admin/responsables")
	public List<Responsable> list(){
		return service.getAll();
		
	}
	
	
	@GetMapping("/admin/responsable/{id}")
	
	public Responsable findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

	
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return "Deleted Succesfully id= " +id;
		
	}
}
