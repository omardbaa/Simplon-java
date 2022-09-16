package soussHealthOnlineStore.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.AppRole;
import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.repositories.AppRoleRepository;
import soussHealthOnlineStore.repositories.UsersRepository;



@Service
@Transactional
public class UsersServiceImpl implements DaoService<Users> {
	
  
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


		

    

	

}
