package com.niraj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.niraj.entity.Student;
import com.niraj.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User GetStudentByObj(String username) {
		//int id = 8;
		System.out.println(username);
		
		//s.beginTransaction();
		Query query =sessionFactory.getCurrentSession().createQuery("from User where userId='"+username+"'");
		User user = (User)query.uniqueResult();
		//String sqlQuery = "from User u where u.userId=? and u.password=?";
		//User user = (User)hibernateTemplate.find(sqlQuery);			
		//User user = (User)sessionFactory.getCurrentSession().get(User.class, id);
		return user;
	}

	@Override
	public void savereg(User user) {
		
		sessionFactory.getCurrentSession().save(user);
	}

}
