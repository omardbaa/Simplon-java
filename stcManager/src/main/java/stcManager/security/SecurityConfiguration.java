package stcManager.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import stcManager.security.jwt.JwtFilter;
import stcManager.security.jwt.UserService;
import stcManager.security.service.UserDetailsServiceImpl;


@SuppressWarnings("deprecation")
@Configuration 
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
	     
@Autowired
private DataSource dataSource;

@Autowired
private UserDetailsServiceImpl userDetailsService;

@Autowired
private UserService userService;

private PasswordEncoder passwordEncoder ;

@Autowired
private JwtFilter jwtFilter;

@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	
auth.userDetailsService(userDetailsService);
//auth.userDetailsService(userService);

}

@Override

@Bean
public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
}

@Override
	protected void configure(HttpSecurity http) throws Exception {
	
http.csrf().disable();
	http.formLogin()/*.loginPage("/login")*/;
	
	http.authorizeRequests().antMatchers("/").permitAll();
	http.authorizeRequests().antMatchers("/authenticate").permitAll();
	http.authorizeRequests().antMatchers("/admin/**").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/participent/**").hasAuthority("PARTICIPENT");
	http.authorizeRequests().antMatchers("/responsable/**").hasAuthority("RESPONSABLE");
	http.authorizeRequests().antMatchers("/webjars/**").permitAll();
//	 http .sessionManagement()
//      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

	
	http.authorizeRequests().anyRequest().authenticated();
	http.exceptionHandling().accessDeniedPage("/403");
	
	}

	
}
