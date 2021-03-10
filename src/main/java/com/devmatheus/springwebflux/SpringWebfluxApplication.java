package com.devmatheus.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@SpringBootApplication

public class SpringWebfluxApplication {



	public static void main(String[] args) {
		System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("devdojo"));
		SpringApplication.run(SpringWebfluxApplication.class, args);
	}


}
