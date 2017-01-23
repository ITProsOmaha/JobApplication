package com.itpros.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itpros.entity.User;
@Repository
public interface UserDAO extends CrudRepository<User, Integer>{
	
	public User findByFirstName(String firstName);
	
}
