package com.zorba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zorba.dto.StudentDto;
import com.zorba.model.Student;
import com.zorba.repository.StudentRepository;
import com.zorba.service.StudentService;

@RestController
@RequestMapping(value ="/student")
public class StudentController {
	@Autowired
	StudentRepository studentRepo;

	@Autowired
	StudentService studentService;

	@PostMapping(value = "/studentCreation")
	public void userCreation(@ModelAttribute("student") Student student) {
		studentService.saveData(student);
		
	}



}
