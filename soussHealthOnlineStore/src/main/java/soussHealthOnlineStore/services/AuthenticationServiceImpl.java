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
	public void addRoleToUser(String username, String roleName) {
		Users user = userRepository.findByUsername(username);
		if (user == null)
			throw new RuntimeException("User not found");
		AppRole appRole = repositroy.findByRoleName(roleName);
		if (appRole == null)
			throw new RuntimeException("Role not found");
		user.getAppRoles().add(appRole);
		userRepository.save(user);

	}

	@Override
	public void removeRoleToUser(String username, String roleName) {
		Users user = userRepository.findByUsername(username);
		if (user == null)
			throw new RuntimeException("User not found");
		AppRole appRole = repositroy.findByRoleName(roleName);
		if (appRole == null)
			throw new RuntimeException("Role not found");
		user.getAppRoles().remove(appRole);

	}

	@Override
	public Users loadUserByUserName(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void save(AppRole appRole) {
		repositroy.save(appRole);
		
	}
public Users registerDefaultUser(Users user) {
    	
        user.setAppRoles(Arrays.asList(repositroy.findByRoleName("CLIENT")));
        return userRepository.save(user);
    }
	

}
