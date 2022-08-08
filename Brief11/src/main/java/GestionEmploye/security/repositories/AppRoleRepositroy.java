package GestionEmploye.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import GestionEmploye.security.entities.AppRole;

public interface AppRoleRepositroy extends JpaRepository<AppRole, Long> {

AppRole findByRoleName (String roleName);

}
