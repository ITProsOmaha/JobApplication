package com.itpros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itpros.entity.User;
import com.itpros.repository.UserDAO;
@Service
public class UserService {
	@Autowired
	private UserDAO userDao;

	public User findUser(int userId){
		return userDao.findOne(userId);
		
	}
	
	public User saveUser(User user){
		return userDao.save(user);
		
	}
	
	public User findUserByName(String fname){
		return userDao.findByFirstName(fname);
		}
}
