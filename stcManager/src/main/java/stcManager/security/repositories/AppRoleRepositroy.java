package stcManager.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import stcManager.security.entities.AppRole;


public interface AppRoleRepositroy extends JpaRepository<AppRole, Long> {

AppRole findByRoleName (String roleName);

}
