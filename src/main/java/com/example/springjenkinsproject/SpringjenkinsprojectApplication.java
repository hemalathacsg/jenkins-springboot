package com.example.springjenkinsproject;


import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjenkinsprojectApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringjenkinsprojectApplication.class);
	@PostConstruct
	public void init(){
		logger.info("application started........");
	}
	public static void main(String[] args) {
		logger.info("application executed...........");
		SpringApplication.run(SpringjenkinsprojectApplication.class, args);
	}

}
