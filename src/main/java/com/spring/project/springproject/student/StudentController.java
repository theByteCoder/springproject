package com.spring.project.springproject.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	@GetMapping
	public List<Student> getStudent() {
		return List.of(new Student(1L, "Subhasish", "subhasish064@gmail.com", LocalDate.of(1991, 05, 25), 29));
	}

}
