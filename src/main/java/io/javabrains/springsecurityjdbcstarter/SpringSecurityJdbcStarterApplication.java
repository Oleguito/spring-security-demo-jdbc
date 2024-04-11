package io.javabrains.springsecurityjdbcstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityJdbcStarterApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringSecurityJdbcStarterApplication.class, args);
	}

}
