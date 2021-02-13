package com.spring.project.springproject.student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStudent() {
		return Arrays.asList(new Student(1, "Subhasish", "subhasish064@gmail.com", LocalDate.of(1991, 05, 25), 29));
	}

}
