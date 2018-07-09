package com.zeki.HibernateDeneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.zeki.HibernateDeneme")
@SpringBootApplication
public class HibernateDenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDenemeApplication.class, args);
	}
}
