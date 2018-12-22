package com.niraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niraj.dao.StudentDAO;
import com.niraj.entity.Student;
import com.niraj.entity.User;


@Service
public class StudentServiceImplo implements StudentService{

	@Autowired
	private StudentDAO studentdao;
	@Override @Transactional
	public void saveobj(Student student) {
		
		studentdao.saveobject(student);
		
		
		
	}
	@Override @Transactional
	public List<Student> getAllStudents() {
		return studentdao.getAllStudents();
	}
	@Override @Transactional
	public Student getStudentByObj(Integer studentID) {
		return studentdao.GetStudentByObj(studentID);
		


		
	}
	@Override @Transactional
	public void DeleteStudentObj(Student student) {
		studentdao.deleteStudentObj(student);
		
	}
	
	

}
