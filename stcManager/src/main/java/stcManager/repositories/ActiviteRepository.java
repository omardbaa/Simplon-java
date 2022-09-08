package stcManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stcManager.model.Activite;


@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long>{

}
