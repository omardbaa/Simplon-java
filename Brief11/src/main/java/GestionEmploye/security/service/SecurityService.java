package GestionEmploye.security.service;

import GestionEmploye.security.entities.AppRole;
import GestionEmploye.security.entities.AppUser;

public interface SecurityService {
	
	AppUser saveNewUser(String username, String password, String rePassword);
	AppRole saveNewRole (String roleName, String description);
	
	void addRoleToUser (String username, String roleName);
	void removeRoleToUser (String username, String roleName);

	AppUser loadUserByUserName (String username);

}
