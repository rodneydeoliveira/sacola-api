package me.dio.sacola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "model")
@SpringBootApplication
public class SacolaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SacolaApiApplication.class, args);
	}

}
