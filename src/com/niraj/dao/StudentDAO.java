package com.niraj.dao;

import java.util.List;

import com.niraj.entity.Student;
import com.niraj.entity.User;

public interface StudentDAO {

	public void saveobject(Student student);

	public List<Student> getAllStudents();

	public Student GetStudentByObj(Integer studentID);

	public void deleteStudentObj(Student student);

	public void savereg(User user);

}
