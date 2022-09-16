package soussHealthOnlineStore.services;

import soussHealthOnlineStore.entities.AppRole;
import soussHealthOnlineStore.entities.Users;

public interface AuthenticationService {

	
	
	
	public void save(AppRole appole);
	
	void addRoleToUser (String username, String roleName);
	void removeRoleToUser (String username, String roleName);

	Users loadUserByUserName (String username);

	

	

}
