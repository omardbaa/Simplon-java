package stcManager.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import stcManager.security.entities.AppUser;

@Repository
public interface AppUserRepositroy extends JpaRepository<AppUser, String> {

AppUser findByUsername (String username);


}
