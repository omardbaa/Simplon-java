package soussHealthOnlineStore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soussHealthOnlineStore.entities.Categorie;
import soussHealthOnlineStore.services.CategorieServiceImpl;




@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/categorie")
public class CategorieController {
	@Autowired
	CategorieServiceImpl service;
	
	
	
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to soussHealthOnlineStore<h1>");
	}
	
	
//	@PreAuthorize("ADMIN")
	@PostMapping("/admin/save")
public Categorie save(@RequestBody Categorie categorie  ) {
		service.save(categorie);
		return categorie;
	}
	
	@PutMapping("/admin/update")
public Categorie update(@RequestBody Categorie categorie  ) {
		service.save(categorie);
		return categorie;
	}
	
	@GetMapping("/client/categories")
	public List<Categorie> list(){
		return service.getAll();
		
	}
	
	
	@GetMapping("/client/categorie/{id}")
	
	public Categorie findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

	
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return "Deleted Succesfully id= " +id;
		
	}
}
