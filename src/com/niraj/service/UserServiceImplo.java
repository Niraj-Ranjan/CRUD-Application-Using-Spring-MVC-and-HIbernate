package com.niraj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niraj.dao.StudentDAO;
import com.niraj.dao.UserDAO;
import com.niraj.entity.User;


@Service
public class UserServiceImplo implements UserService{

	
	@Autowired
	private UserDAO userdao;

	@Override @Transactional
	public void saveregis(User user) {
		userdao.savereg(user);
		
	}

	@Override  @Transactional
	public User getStudentByObj(String username) {
		return userdao.GetStudentByObj(username);
		
	}
	
	
}
