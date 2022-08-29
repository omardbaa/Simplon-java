package stcManager.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stcManager.model.Responsable;
import stcManager.repositories.ResponsableRepository;

@Service
@Transactional
public class ResponsableServiceImpl implements DaoService<Responsable> {
	
	@Autowired
	ResponsableRepository repository;
	
	@Override
	public void saveOrUpdate(Responsable responsable) {
repository.save(responsable);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Responsable findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Responsable> getAll() {
		return (List<Responsable>)repository.findAll();
	}
	
	
	
	

	

}
