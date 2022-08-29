package stcManager.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stcManager.model.Activite;
import stcManager.repositories.ActiviteRepository;


@Service
@Transactional
public class ActiviteServiceImpl implements DaoService<Activite> {
	
	@Autowired
	ActiviteRepository repository;
	
	@Override
	public void saveOrUpdate(Activite activite) {
repository.save(activite);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Activite findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Activite> getAll() {
		return (List<Activite>)repository.findAll();
	}
	
	
	
	

	

}
