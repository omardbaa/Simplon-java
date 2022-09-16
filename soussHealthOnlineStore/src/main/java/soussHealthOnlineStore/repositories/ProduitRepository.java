package soussHealthOnlineStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soussHealthOnlineStore.entities.Command;
import soussHealthOnlineStore.entities.Produit;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{
	

	
}
