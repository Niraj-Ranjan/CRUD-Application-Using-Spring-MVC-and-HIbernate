package com.niraj.dao;

import com.niraj.entity.User;

public interface UserDAO {

	

	User GetStudentByObj(String username);

	void savereg(User user);

}
