package stcManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stcManager.model.Participent;

@Repository
public interface ParticipentRepository extends JpaRepository<Participent, Long> {

}
