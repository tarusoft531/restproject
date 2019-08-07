package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rest.bean.Student;
import com.rest.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentservice;

	@GetMapping("/studentDetails.do")
	public String getAllStudents(Model model) 
	{
		List<Student> list = studentservice.getAllStudents();
		model.addAttribute("list", list);
		return "studentList";
	}
}
