package com.itpros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.itpros.entity.User;
import com.itpros.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
    
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public User findUser(@PathVariable("id") Integer id){
		User user = userService.findUser(id);
		System.out.println("---------------------");
		return user;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="registerUser")
	public String addUser(){
		User user=new User("Lalli","Malem");
		userService.saveUser(user);
		return "User added successfully";
	}
	
	@RequestMapping(value="/name/{fname}",method=RequestMethod.GET)
	public User findByName(@PathVariable("fname") String fname){
		User user = userService.findUserByName(fname);
		return user;
		
	}
	

}
