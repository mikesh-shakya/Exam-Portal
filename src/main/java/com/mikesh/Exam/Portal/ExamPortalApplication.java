package com.mikesh.Exam.Portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class ExamPortalApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
		System.out.println("Hello Application");
	}
}
