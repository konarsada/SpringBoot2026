package com.learning.SpringBoot2026;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot2026Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBoot2026Application.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot2026Application.class, args);
		context.close();

	}

}
