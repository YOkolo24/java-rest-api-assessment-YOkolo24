package com.cbfacademy.apiassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TasksProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksProjectApplication.class, args);
	}

    
}