package soussHealthOnlineStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soussHealthOnlineStore.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	

	Client findByUsername(String username);

}
