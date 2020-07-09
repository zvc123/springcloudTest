package cn.zvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zvc.pojo.User;
import cn.zvc.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{id}")
	public User queryById(@PathVariable Long id){
		
		User user = userService.queryById(id);
		System.out.println(user);
		return user;
	}
}
