package com.niraj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niraj.entity.Student;


@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveobject(Student student) {
	
		sessionFactory.getCurrentSession().save(student);
		
		
		
	}

}
