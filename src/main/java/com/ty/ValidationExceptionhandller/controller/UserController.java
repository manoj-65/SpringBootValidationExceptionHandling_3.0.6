package com.ty.ValidationExceptionhandller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.ValidationExceptionhandller.dao.UserDao;
import com.ty.ValidationExceptionhandller.dto.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserDao dao;

	@PostMapping
	public User saveUser(@RequestBody @Valid User user) {
		return dao.saveUser(user);
	}
}
