package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {
	

}
