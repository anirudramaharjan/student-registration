package com.zorba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zorba.dto.StudentDto;
import com.zorba.model.Student;
import com.zorba.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;


	public Student saveData(Student studentDto) {
		Student student = new Student(studentDto.getUserName(), studentDto.getPassword(), studentDto.getFirstName(), studentDto.getMiddleName(), studentDto.getLastName(), studentDto.getEmail(), studentDto.getAddress(), studentDto.getPhone());
		return studentRepo.save(student);

	}



}
