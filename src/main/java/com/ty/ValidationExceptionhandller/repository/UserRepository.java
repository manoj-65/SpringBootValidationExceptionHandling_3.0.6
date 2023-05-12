package com.ty.ValidationExceptionhandller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.ValidationExceptionhandller.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
