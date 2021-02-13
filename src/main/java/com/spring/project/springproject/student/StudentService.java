package com.spring.project.springproject.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStudent() {
		return List.of(new Student(1L, "Subhasish", "subhasish064@gmail.com", LocalDate.of(1991, 05, 25), 29));
	}

}
