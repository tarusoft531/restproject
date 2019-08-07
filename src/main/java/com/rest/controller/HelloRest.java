package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.bean.Student;
import com.rest.service.StudentService;


@RestController
public class HelloRest {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/hello")
	public List<Student> sayHello()
	{
		return studentservice.getAllStudents();
	}
}
