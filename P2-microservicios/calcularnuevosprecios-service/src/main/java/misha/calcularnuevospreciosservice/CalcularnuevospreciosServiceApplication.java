package misha.calcularnuevospreciosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CalcularnuevospreciosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcularnuevospreciosServiceApplication.class, args);
	}

}
