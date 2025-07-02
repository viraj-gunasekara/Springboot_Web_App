package com.group36.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group36.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
