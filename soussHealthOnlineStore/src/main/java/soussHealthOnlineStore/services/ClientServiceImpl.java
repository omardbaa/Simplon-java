package soussHealthOnlineStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.Client;
import soussHealthOnlineStore.repositories.ClientRepository;




@Service
@Transactional
public class ClientServiceImpl implements DaoService<Client> {
	
	@Autowired
	ClientRepository repository;
	
	@Override
	public void save(Client client) {
repository.save(client);		
	}
	
	@Override
	public void update(Client client) {
		repository.save(client);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Client findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Client> getAll() {
		return (List<Client>)repository.findAll();
	}


	

	

}
