package soussHealthOnlineStore.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.AppRole;
import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.repositories.AppRoleRepository;
import soussHealthOnlineStore.repositories.UsersRepository;



@Service
@Transactional
public class AccountServiceImpl implements DaoService<Users> {
	
  
	@Autowired
	private PasswordEncoder passwordEncoder;

    @Autowired 
    private AppRoleRepository roleRepo;
  
	
	@Autowired
	private UsersRepository userRepository;
	
	@Override
	public void save(Users users) {
		String password = users.getPassword();
		users.setPassword(passwordEncoder.encode(password));
		userRepository.save(users);		
	}
	
	@Override
	public void update(Users users) {
		userRepository.save(users);		
	}


	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);	
	}
 
	@Override
	public Users findById(Long id) {
		return userRepository.findById(id).get();
	}
	
	

	@Override
	public List<Users> getAll() {
		return (List<Users>)userRepository.findAll();
	}

	
	public Users loadUserByUserName(String username) {
		return userRepository.findByUsername(username);
	}

	public void addRoleToUser(String username, String roleName) {
		Users user = userRepository.findByUsername(username);
		if (user == null)
			throw new RuntimeException("User not found");
		AppRole appRole = roleRepo.findByRoleName(roleName);
		if (appRole == null)
			throw new RuntimeException("Role not found");
		user.getAppRoles().add(appRole);
		userRepository.save(user);

	}

	
	public void removeRoleToUser(String username, String roleName) {
		Users user = userRepository.findByUsername(username);
		if (user == null)
			throw new RuntimeException("User not found");
		AppRole appRole = roleRepo.findByRoleName(roleName);
		if (appRole == null)
			throw new RuntimeException("Role not found");
		user.getAppRoles().remove(appRole);

	}

	
	public void save(AppRole appRole) {
		roleRepo.save(appRole);
		
	}
public Users registerDefaultUser(Users user) {
	String password = user.getPassword();
	user.setPassword(passwordEncoder.encode(password));
    	
        user.setAppRoles(Arrays.asList(roleRepo.findByRoleName("CLIENT")));
        return userRepository.save(user);
    }
	
	

}
