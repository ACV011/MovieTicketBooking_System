package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MovieExperimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieExperimentApplication.class, args);
	}

}
