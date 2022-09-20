package soussHealthOnlineStore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.AppRole;
import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.repositories.AppRoleRepository;
import soussHealthOnlineStore.repositories.UsersRepository;



@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	 UsersRepository userRepository;
	
	@Autowired
	 AppRoleRepository repositroy;


	
	@Override
	public Users loadUserByUserName(String username) {
		return userRepository.findByUsername(username);
	}

	
	

}
