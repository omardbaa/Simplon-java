package GestionEmploye.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import GestionEmploye.security.service.UserDetailsServiceImpl;

@SuppressWarnings("deprecation")
@Configuration 
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
	     
@Autowired
private DataSource dataSource;

@Autowired
private UserDetailsServiceImpl userDetailsService;

//private PasswordEncoder passwordEncoder ;



@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	
	

	/*
	String encodPWD=passwordEncoder().encode("123");
	System.out.println(encodPWD);
	auth.inMemoryAuthentication().withUser("user").password(encodPWD).roles("USER");
	auth.inMemoryAuthentication().withUser("user1").password(passwordEncoder.encode("1234")).roles("USER");
	auth.inMemoryAuthentication().withUser("user2").password(passwordEncoder.encode("12345")).roles("USER");
	auth.inMemoryAuthentication().withUser("user3").password(passwordEncoder.encode("123456")).roles("USER");
	
	auth.inMemoryAuthentication().withUser("Admin").password(passwordEncoder.encode("123")).roles("USER", "ADMIN");

	
	
 auth.jdbcAuthentication().dataSource(dataSource)
.usersByUsernameQuery("select username as principal, password as credentials, active from users where username=?")
.authoritiesByUsernameQuery("select username as principal, role as role from users_roles  where username=?")
.rolePrefix("ROLE_")
.passwordEncoder(passwordEncoder);

}
	
*/
auth.userDetailsService(userDetailsService);
}
@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	http.formLogin()/*.loginPage("/login")*/;
	
	http.authorizeRequests().antMatchers("/").permitAll();
	http.authorizeRequests().antMatchers("/admin/**").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/user/**").hasAuthority("USER");
	http.authorizeRequests().antMatchers("/webjars/**").permitAll();
	http.authorizeRequests().anyRequest().authenticated();
	http.exceptionHandling().accessDeniedPage("/403");
	
	}

	
}
