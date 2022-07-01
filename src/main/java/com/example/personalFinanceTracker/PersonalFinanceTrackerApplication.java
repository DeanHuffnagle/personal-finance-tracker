package com.example.personalFinanceTracker;

import com.example.personalFinanceTracker.domain.AppUser;
import com.example.personalFinanceTracker.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class PersonalFinanceTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceTrackerApplication.class, args);
	}


//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}


	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {


			userService.saveUser(new AppUser(
					null,
					"Regeebo",
					"1F90a62",
					null,
					null
			));
			userService.saveUser(new AppUser(
					null,
					"Deebo",
					"password",
					null,
					null
			));





		};
	}



}
