package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Proy3ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proy3ZuulGatewayApplication.class, args);
	}

}
