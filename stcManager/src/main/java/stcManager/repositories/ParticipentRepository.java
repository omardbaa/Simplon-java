package stcManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import stcManager.model.Participent;

public interface ParticipentRepository extends JpaRepository<Participent, Long> {

}
