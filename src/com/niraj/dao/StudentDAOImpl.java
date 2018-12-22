package com.niraj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niraj.entity.Student;
import com.niraj.entity.User;


@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveobject(Student student) {
	
		sessionFactory.getCurrentSession().save(student);
		
		
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
		
		
	}

	@Override
	public Student GetStudentByObj(Integer studentID) {
		Student student = (Student)sessionFactory.getCurrentSession().get(Student.class,studentID );
		return student;
	}

	@Override
	public void deleteStudentObj(Student student) {
		
		sessionFactory.getCurrentSession().delete(student);


		
	}

	@Override
	public void savereg(User user) {
		
		sessionFactory.getCurrentSession().save(user);
	}

}
