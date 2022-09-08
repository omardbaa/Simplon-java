package stcManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stcManager.model.Exercice;

@Repository
public interface ExerciceRepository extends JpaRepository<Exercice, Long>{

}
