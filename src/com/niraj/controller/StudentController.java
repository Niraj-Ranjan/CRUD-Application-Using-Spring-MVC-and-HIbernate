package com.niraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niraj.entity.Student;
import com.niraj.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/showFormForAdd")
	public String showAddForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	@RequestMapping("/saveprocess")
	public String saveProcess(@ModelAttribute("student") Student student){
		//System.out.println(student);
		studentservice.saveobj(student);
		
		return "list-students";
		
		
		
	}	
	@RequestMapping("/showalllist")
	public String getalldetais(Model model) {
		List<Student> list  = studentservice.getAllStudents();
		model.addAttribute("thestudent",list);
		
		return "list-students";
	}
	
	
	
	@RequestMapping("/updateRecord")
	private String ShowUpdateForm(@RequestParam("studentId") Integer studentId, Model model) {
		
		Student student = findById(studentId);
		model.addAttribute("student", student);
		return "student-form";
		
	}
	
	
	@RequestMapping("/deleteRecord")
	private String DeleteStundentObj(@RequestParam("studentId") Integer studentId) {
		Student student = findById(studentId);
		studentservice.DeleteStudentObj(student);
		
		return "redirect:/showalllist";
		
	}

	private Student findById(Integer studentID) {
		Student student = studentservice.getStudentByObj(studentID);
		return student;
	}
	

	
	
	


}
