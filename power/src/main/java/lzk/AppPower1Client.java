package lzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppPower1Client {
	public static void main(String[] args) {
		SpringApplication.run(AppPower1Client.class);
	}
}
