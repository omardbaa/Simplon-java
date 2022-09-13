package soussHealthOnlineStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.repositories.UsersRepository;



@Service
@Transactional
public class UsersServiceImpl implements DaoService<Users> {
	
	@Autowired
	UsersRepository repository;
	
	@Override
	public void save(Users users) {
repository.save(users);		
	}
	
	@Override
	public void update(Users users) {
		repository.save(users);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Users findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Users> getAll() {
		return (List<Users>)repository.findAll();
	}


	

	

}
