package GestionEmploye.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import GestionEmploye.security.entities.AppUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private SecurityService securityService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

AppUser appUser=securityService.loadUserByUserName(username);

/*
Collection<GrantedAuthority> authorities=new ArrayList();
appUser.getAppRoles().forEach(role-> {
	
	SimpleGrantedAuthority authority=new SimpleGrantedAuthority(role.getRoleName());
    authorities.add(authority);

});*/

Collection<GrantedAuthority> authorities=
appUser.getAppRoles().stream().map(role ->new SimpleGrantedAuthority(role.getRoleName()))
.collect(Collectors.toList());

User user=new User (appUser.getUsername(), appUser.getPassword(), authorities);
		return user;
	}

}
