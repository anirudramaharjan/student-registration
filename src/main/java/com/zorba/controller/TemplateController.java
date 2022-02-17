package com.zorba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zorba.repository.StudentRepository;

@Controller
public class TemplateController {

	@Autowired
	StudentRepository studentRepo;

	@GetMapping(value = "/form")
	public String getRegistrationForm() {
		return "registration";
	}



}
