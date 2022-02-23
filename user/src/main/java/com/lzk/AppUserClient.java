package com.lzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppUserClient {
	public static void main(String[] args) {
		SpringApplication.run(AppUserClient.class);
	}
}
