package stcManager.security.service;

import stcManager.security.entities.AppRole;
import stcManager.security.entities.AppUser;

public interface SecurityService {
	
	AppUser saveNewUser(String username, String password,String email, String rePassword, boolean active);
	AppRole saveNewRole (String roleName);
	
	void addRoleToUser (String username, String roleName);
	void removeRoleToUser (String username, String roleName);

	AppUser loadUserByUserName (String username);

}
