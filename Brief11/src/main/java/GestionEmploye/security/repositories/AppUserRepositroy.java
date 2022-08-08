package GestionEmploye.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import GestionEmploye.security.entities.AppUser;

public interface AppUserRepositroy extends JpaRepository<AppUser, String> {

AppUser findByUsername (String username);

}
