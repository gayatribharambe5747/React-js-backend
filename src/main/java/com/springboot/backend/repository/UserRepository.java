package com.springboot.backend.repository;

import org.springframework.stereotype.Repository;

import com.springboot.backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
	
}
