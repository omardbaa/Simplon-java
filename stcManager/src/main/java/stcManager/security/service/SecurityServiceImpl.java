package stcManager.security.service;

import java.util.UUID;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import stcManager.security.entities.AppRole;
import stcManager.security.entities.AppUser;
import stcManager.security.repositories.AppRoleRepositroy;
import stcManager.security.repositories.AppUserRepositroy;

@Service
@Slf4j
@AllArgsConstructor
@Transactional

public class SecurityServiceImpl implements SecurityService {

	private AppUserRepositroy appUserRepositroy;
	private AppRoleRepositroy appRoleRepositroy;
	private PasswordEncoder passwordEncoder;
	
	@Override
	public AppUser saveNewUser(String username, String password,String email, String rePassword, boolean active) {
if(!password.equals(rePassword)) throw new RuntimeException("Password not match") ;

String hashedPWD=passwordEncoder.encode(password);
AppUser appUser= new AppUser(); 
appUser.setUserId(UUID.randomUUID().toString());
appUser.setEmail(email);
appUser.setUsername(username);
appUser.setPassword(hashedPWD);
appUser.setActive(true);
AppUser savedAppUser= appUserRepositroy.save(appUser);
return savedAppUser;
	}

	@Override
	public AppRole saveNewRole(String roleName) {
		AppRole appRole= appRoleRepositroy.findByRoleName(roleName);
		
		if(appRole!=null) throw new RuntimeException("Role "+roleName+ " already exist");
		
		appRole=new AppRole();
		appRole.setRoleName(roleName);
		AppRole savedAppRole= appRoleRepositroy.save(appRole);

		return savedAppRole;
	}


	@Override
	public void addRoleToUser(String username, String roleName) {
		AppUser appUser=appUserRepositroy.findByUsername(username);
		if(appUser==null) throw new RuntimeException("User not found");
		AppRole appRole=appRoleRepositroy.findByRoleName(roleName);
		if(appRole==null) throw new RuntimeException("Role not found");
		appUser.getAppRoles().add(appRole);
		
		
	}

	@Override
	public void removeRoleToUser(String username, String roleName) {
		AppUser appUser=appUserRepositroy.findByUsername(username);
		if(appUser==null) throw new RuntimeException("User not found");
		AppRole appRole=appRoleRepositroy.findByRoleName(roleName);
		if(appRole==null) throw new RuntimeException("Role not found");
		appUser.getAppRoles().remove(appRole);
		
	}

	@Override
	public AppUser loadUserByUserName(String username) {
		return appUserRepositroy.findByUsername(username);
	}

}
