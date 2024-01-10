package com.example.interback_be;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class InterbackBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterbackBeApplication.class, args);
	}

}
