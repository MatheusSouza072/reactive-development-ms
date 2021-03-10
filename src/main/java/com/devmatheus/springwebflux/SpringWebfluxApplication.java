package com.devmatheus.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ReactiveAdapterRegistry;

@SpringBootApplication

public class SpringWebfluxApplication {

        System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("devdojo"));

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxApplication.class, args);
	}


}
