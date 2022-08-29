package stcManager.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stcManager.model.Exercice;
import stcManager.repositories.ExerciceRepository;


@Service
@Transactional
public class ExerciceServiceImpl implements DaoService<Exercice> {
	
	@Autowired
	ExerciceRepository repository;
	
	@Override
	public void saveOrUpdate(Exercice exercice) {
repository.save(exercice);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Exercice findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Exercice> getAll() {
		return (List<Exercice>)repository.findAll();
	}
	
	
	
	

	

}
