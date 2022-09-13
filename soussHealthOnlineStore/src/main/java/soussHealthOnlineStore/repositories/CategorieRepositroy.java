package soussHealthOnlineStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soussHealthOnlineStore.entities.Categorie;

@Repository
public interface CategorieRepositroy extends JpaRepository<Categorie, Long>{

}
