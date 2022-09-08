package stcManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stcManager.model.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

}
