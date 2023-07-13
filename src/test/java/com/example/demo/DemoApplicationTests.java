package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = DemoApplicationTests.class)
@ContextConfiguration(classes = {DemoApplicationTests.class})
public class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

