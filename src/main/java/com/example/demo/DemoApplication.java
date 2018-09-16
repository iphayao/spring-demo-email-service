package com.example.demo;

import com.example.demo.email.EmailService;
import com.example.demo.email.EmailServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Bean
	public EmailService emailService() {
		return new EmailServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}