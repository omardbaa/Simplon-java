package soussHealthOnlineStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soussHealthOnlineStore.entities.Produit;
import soussHealthOnlineStore.repositories.ProduitRepository;



@Service
@Transactional
public class ProduitServiceImpl implements DaoService<Produit> {
	
	@Autowired
	ProduitRepository repository;
	
	@Override
	public void save(Produit produit) {
repository.save(produit);		
	}
	
	@Override
	public void update(Produit produit) {
		repository.save(produit);		
	}


	@Override
	public void delete(Long id) {
repository.deleteById(id);	
	}
 
	@Override
	public Produit findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Produit> getAll() {
		return (List<Produit>)repository.findAll();
	}


	

	

}
