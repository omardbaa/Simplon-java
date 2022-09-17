package soussHealthOnlineStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class SoussHealthOnlineStoreApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SoussHealthOnlineStoreApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

}
