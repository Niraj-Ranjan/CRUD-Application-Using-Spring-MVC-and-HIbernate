package com.niraj.service;

import java.util.List;

import com.niraj.entity.Student;
import com.niraj.entity.User;

public interface StudentService {

	public void saveobj(Student student);

	public List<Student> getAllStudents();

	public Student getStudentByObj(Integer studentID);

	public void DeleteStudentObj(Student student);



}
