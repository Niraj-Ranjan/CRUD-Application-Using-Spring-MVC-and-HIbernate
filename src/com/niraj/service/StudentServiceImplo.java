package com.niraj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niraj.dao.StudentDAO;
import com.niraj.entity.Student;


@Service
public class StudentServiceImplo implements StudentService{

	@Autowired
	private StudentDAO studentdao;
	@Override @Transactional
	public void saveobj(Student student) {
		
		studentdao.saveobject(student);
		
		
		
	}

}
