package com.spring.project.springproject.student;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student firstStudent = new Student(1, "Subhasish", "subhasish.ghosh@yahoo.com", LocalDate.of(1991, 05, 25));
			Student secondStudent = new Student(2, "Piyu", "piyu.paul@gmail.com", LocalDate.of(1991, 06, 20));
			repository.saveAll(Arrays.asList(firstStudent, secondStudent));
		};
	}

}
