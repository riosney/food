package com.escudo7.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.escudo7.food.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class Escudo7foodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Escudo7foodApiApplication.class, args);
	}

}
