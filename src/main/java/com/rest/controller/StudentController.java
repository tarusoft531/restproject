package com.rest.controller;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.rest.bean.Student;

@Controller
public class StudentController {
	
	@GetMapping("/studentDetails.do")
	public String getAllStudents(Model model) 
	{
		
		RestTemplate template = new RestTemplate();
		
		String URI = "http://localhost:8081/hello";
		ResponseEntity<Student[]> response = template.getForEntity(URI, Student[].class);
		
		model.addAttribute("list", Arrays.asList(response.getBody()));
		
		return "studentList";
	}
}
