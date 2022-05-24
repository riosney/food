package com.escudo7.food;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.escudo7.food.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class Escudo7foodApiApplication {

	public static void main(String[] args) {
//		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(Escudo7foodApiApplication.class, args);
	}

}
