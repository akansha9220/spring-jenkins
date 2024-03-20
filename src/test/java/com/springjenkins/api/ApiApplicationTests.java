package com.springjenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(ApiApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test class executed....");
		assertEquals(true, true);
	}

}
