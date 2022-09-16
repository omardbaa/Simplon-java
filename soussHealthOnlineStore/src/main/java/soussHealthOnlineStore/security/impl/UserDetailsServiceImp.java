package soussHealthOnlineStore.security.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.services.AuthenticationService;



@Service
public class UserDetailsServiceImp implements UserDetailsService {

	private AuthenticationService authenticationService ;

	public UserDetailsServiceImp(AuthenticationService authenticationService ) {
		this.authenticationService = authenticationService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = authenticationService.loadUserByUserName(username);
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		user.getAppRoles().forEach(r -> {
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
		});
		return new User(user.getUsername(), user.getPassword(), authorities);
	}

}
