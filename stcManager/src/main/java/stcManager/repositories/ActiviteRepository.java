package stcManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import stcManager.model.Activite;


//@RepositoryRestResource
public interface ActiviteRepository extends JpaRepository<Activite, Long>{

}
