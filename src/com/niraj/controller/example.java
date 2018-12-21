package com.niraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niraj.entity.Student;
import com.niraj.service.StudentService;


@Controller
public class example {
	
	
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/saveprocess")
	public String saveProcess(@ModelAttribute("student") Student student){
		//System.out.println(student);
		studentservice.saveobj(student);
		
		return "list-students";
		
		
		
	}

}
