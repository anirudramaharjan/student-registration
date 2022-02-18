package com.zorba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zorba.dto.StudentDto;
import com.zorba.model.Student;
import com.zorba.repository.StudentRepository;
import com.zorba.service.StudentService;

@Controller
@RequestMapping(value ="/student")
public class StudentController {
	@Autowired
	StudentRepository studentRepo;

	@Autowired
	StudentService studentService;



	@GetMapping(value= "/studentCreation")
	public String getUserCreationForm(Student student) {
		return "registration";
	}
	
	@PostMapping(value= "/studentCreate")
	public String createUser(@ModelAttribute("student") StudentDto studentDto) {
		studentService.saveData(studentDto);
		return "login";
	}
	
	@GetMapping(value= "/login")
	public String getUserLogin() {
		return "login";
	}
//	@PostMapping("/studentCreate")
//	public Student postUser(@ModelAttribute("student")  Student student) {
//		return studentRepo.save(student);
//	}

	

}
