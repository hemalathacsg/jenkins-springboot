package com.example.springjenkinsproject;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringjenkinsprojectApplicationTests {
	//to check if the test process is auotmated or not with the help of jenkins
	public static Logger logger = LoggerFactory.getLogger(SpringjenkinsprojectApplication.class);

	@Test
	public void contextLoads() {
//		logger.info("Test case executing........");
//		logger.info("Test case executing second log statement  ........");
		assertEquals(true, true);
	}
}