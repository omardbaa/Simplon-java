package stcManager.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stcManager.security.entities.AppRole;

@Repository
public interface AppRoleRepositroy extends JpaRepository<AppRole, Long> {

AppRole findByRoleName (String roleName);

}
