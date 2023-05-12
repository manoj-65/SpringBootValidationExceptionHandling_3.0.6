package com.ty.ValidationExceptionhandller.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.ValidationExceptionhandller.dto.User;
import com.ty.ValidationExceptionhandller.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}
}
