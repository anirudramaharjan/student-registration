package com.zorba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zorba.model.Student;
import com.zorba.repository.StudentRepository;

@Controller
public class TemplateController {

	@Autowired
	StudentRepository studentRepo;

	@GetMapping(value ="/")
	public String home() {
		return "index";
	}
	@GetMapping(value = "/registration")
	public String getRegistrationForm(Student student) {
		return "registration";
	}

	@GetMapping(value ="/login")
	public String loginPage() {
		return "login";
	}


}
