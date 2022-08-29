package stcManager.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import stcManager.security.entities.AppUser;


public interface AppUserRepositroy extends JpaRepository<AppUser, String> {

AppUser findByUsername (String username);

}
