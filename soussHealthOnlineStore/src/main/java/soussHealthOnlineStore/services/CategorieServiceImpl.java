package soussHealthOnlineStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.Categorie;
import soussHealthOnlineStore.repositories.CategorieRepositroy;




@Service
@Transactional
public class CategorieServiceImpl implements DaoService<Categorie> {
	
	@Autowired
	CategorieRepositroy repositroy;
	
	@Override
	public void save(Categorie categorie) {
		repositroy.save(categorie);		
	}
	
	@Override
	public void update(Categorie categorie) {
		repositroy.save(categorie);		
	}


	@Override
	public void delete(Long id) {
		repositroy.deleteById(id);	
	}
 
	@Override
	public Categorie findById(Long id) {
		return repositroy.findById(id).get();
	}

	@Override
	public List<Categorie> getAll() {
		return (List<Categorie>)repositroy.findAll();
	}


	

	

}
