package soussHealthOnlineStore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.services.UsersServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/user")
public class UsersController {
	@Autowired
	private UsersServiceImpl service;

public UsersController(UsersServiceImpl service){
	this.service = service;
}
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to soussHealthOnlineStore<h1>");
	}
	
	
	 
	
	
	@PostMapping("/save")
public Users save(@RequestBody Users users  ) {
		service.save(users);
		return users;
	}
	@PutMapping("/update")
	public Users update(@RequestBody Users users  ) {
		service.save(users);
		return users;
	}
	
	
	@GetMapping("/users")
	public ResponseEntity <List<Users>> getAll(){
		List<Users> users = service.getAll();
		return new ResponseEntity<>(users, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/user/{id}")
	
	public ResponseEntity <Users> findById(@PathVariable ("id") Long id) {
		Users user = service.findById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}

	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity <?> delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return new ResponseEntity <>(HttpStatus.OK);
		
	}
}
