package stcManager.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stcManager.model.Participent;
import stcManager.repositories.ParticipentRepository;


@Service
@Transactional
public class ParticipentServiceImpl implements DaoService<Participent> {
	
	@Autowired
	ParticipentRepository repository;
	
	@Override
	public void saveOrUpdate(Participent participent) {
repository.save(participent);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Participent findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Participent> getAll() {
		return (List<Participent>)repository.findAll();
	}
	
	
	
	

	

}
