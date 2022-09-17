package soussHealthOnlineStore.services;


import soussHealthOnlineStore.entities.Users;


public interface AuthenticationService {


	Users loadUserByUserName (String username);

	

	

}