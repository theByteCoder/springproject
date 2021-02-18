package com.spring.project.springproject.student;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
		if (studentByEmail.isPresent()) {
			throw new IllegalStateException("Student already present");
		}
		studentRepository.save(student);
	}

	public void deleteStudent(Integer studentId) {
		Boolean exist = studentRepository.existsById(studentId);
		if (!exist) {
			throw new IllegalStateException("Student is not present");
		}
		studentRepository.deleteById(studentId);
	}

	@Transactional
	public void updateStudent(Integer studentId, String name, String email) {
		Student student = studentRepository.findById(studentId)
				.orElseThrow(() -> new IllegalStateException("Student is not present"));
		student.setName(name);
		student.setEmail(email);
	}

}