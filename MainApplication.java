package com.app.taller;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallerJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TallerJpaApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Bienvenidos al Taller de Spring DATA JPA ");
	}

}
