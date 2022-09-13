package soussHealthOnlineStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soussHealthOnlineStore.entities.Command;


@Repository
public interface CommandRepository extends JpaRepository<Command, Long>{

}
