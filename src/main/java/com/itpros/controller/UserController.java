package com.itpros.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
    
	@RequestMapping(value="byId", method=RequestMethod.GET)
	public User findUser(Integer id){
		//return userService.findUser(id);
		System.out.println("git test");
		return new User("Gayathri","Malempati",1);
	}
	
	/*@RequestMapping(method=RequestMethod.GET,name="byAll")
	public User findAllUsers(){
		return null;
	}
	*/

}
