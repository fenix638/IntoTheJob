package com.intothejobs.be;

import com.intothejobs.be.businessobject.Utente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.swing.plaf.basic.BasicViewportUI;

@SpringBootApplication
@Configuration
public class IntoTheJobBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntoTheJobBeApplication.class, args);
	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}


}
