package com.hackathon.asapcardConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.hackathon.repository")
@SpringBootApplication
@ComponentScan("com.hackathon.repository") 
public class AsapcardConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsapcardConsumerApplication.class, args);
	}

}
