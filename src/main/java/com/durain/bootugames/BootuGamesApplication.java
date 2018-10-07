package com.durain.bootugames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BootuGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootuGamesApplication.class, args);
	}
}
