package com.staringStar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;

@SpringBootApplication(scanBasePackages = { "com.staringStar" })
//@EnablePrometheusEndpoint
public class StaringStarApplication {

	public static void main(String[] args) {
		System.out.println("star is staring");
		SpringApplication.run(StaringStarApplication.class, args);
	}

}
