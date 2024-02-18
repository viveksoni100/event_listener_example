package com.example.eventlistenerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class EventListenerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventListenerDemoApplication.class, args);
	}

}
