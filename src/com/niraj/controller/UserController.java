package com.niraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niraj.entity.Student;
import com.niraj.entity.User;
import com.niraj.service.StudentService;
import com.niraj.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;

	@RequestMapping("/UserFormForAdd")
	public String showAddForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@RequestMapping("/register")
	public String saveProcess(@ModelAttribute("user") User user) {
		// System.out.println(student);
		userservice.saveregis(user);

		return "login";

	}

	@RequestMapping("/UserLoginForm")
	public String ShowLoginForm(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/login")
	public void validateUsr(@RequestParam("uname") String username, @RequestParam("upass") String password,
			Model model) {

		User user = findByUserID(username);

		try {
			if (username.equals(user.getUserId())) {
				System.out.println("sucss");

			}

			else {
				System.out.println("Fail");
			}

		} catch (Exception e) {
			System.out.println("Not found");
		}

	}

	private User findByUserID(String username) {
		User user = userservice.getStudentByObj(username);
		return user;
	}

}
