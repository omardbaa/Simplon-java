package soussHealthOnlineStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soussHealthOnlineStore.entities.AppRole;


@Repository
public interface AppRoleRepository extends JpaRepository<AppRole,Long> {

	AppRole findByRoleName(String roleName);
	

}
