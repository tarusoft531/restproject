package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rest.bean.Student;
import com.rest.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentservice;

	@RequestMapping(value = "/student/all", method = RequestMethod.GET)
	public ModelAndView getAllStudents() {
		System.out.println(this.getClass().getName());
		ModelAndView mav = new ModelAndView("studentList");
		List<Student> list = studentservice.getAllStudents();
		mav.addObject("list", list);
		return mav;
	}
}
