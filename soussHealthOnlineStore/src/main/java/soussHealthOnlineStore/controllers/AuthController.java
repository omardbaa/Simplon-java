package soussHealthOnlineStore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import soussHealthOnlineStore.entities.AppRole;
import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.services.AuthenticationServiceImpl;
import soussHealthOnlineStore.services.UsersServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/auth")
public class AuthController {

	@Autowired
	UsersServiceImpl userService;

	@Autowired
	AuthenticationServiceImpl service;

	@GetMapping("/")

	public String Home() {
		return ("<h1>Welcom to soussHealthOnlineStore<h1>");
	}
	
	
	@PostMapping("/save")
public Users save(@RequestBody Users users  ) {
		userService.save(users);
		return users;
	}
	

	@GetMapping("/admin/users")
	public List<Users> list(){
		return userService.getAll();
		
	}
	
	@PostMapping(path = "admin/role/save")
	public AppRole saveRole(@RequestBody AppRole appRole) {
		service.save(appRole);
		return appRole;
	}
	
	@PostMapping(path = "admin/roleToUser")
public void addRoleToUser(@RequestBody RoleUserForm roleUserForm ) {
		
		service.addRoleToUser(roleUserForm.getUsername(),roleUserForm.getRoleName());
	}
}

@Data
class RoleUserForm {
	private String username;
	private String roleName;
}
	

