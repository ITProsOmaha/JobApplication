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
		return userDao.findUser(userId);
	}
}
