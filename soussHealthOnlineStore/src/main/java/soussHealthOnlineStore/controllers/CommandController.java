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

import soussHealthOnlineStore.entities.Command;
import soussHealthOnlineStore.services.CommandServiceImpl;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/command")
public class CommandController {
	@Autowired
	CommandServiceImpl service;
	
	
	
	
	@GetMapping ("/")
	
	public String Home () {
		return ("<h1>Welcom to soussHealthOnlineStore<h1>");
	}
	
	
//	@PreAuthorize("ADMIN")
	@PostMapping("/admin/save")
public Command save(@RequestBody Command command  ) {
		service.save(command);
		return command;
	}
	
	@PutMapping("/admin/update")
public Command update(@RequestBody Command command  ) {
		service.save(command);
		return command;
	}
	
	@GetMapping("/client/commands")
	public List<Command> list(){
		return service.getAll();
		
	}
	
	
	@GetMapping("/client/command/{id}")
	
	public Command findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

	
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
		return "Deleted Succesfully id= " +id;
		
	}
}
