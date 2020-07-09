package cn.zvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zvc.client.UserClient;
import cn.zvc.pojo.User;

@RestController
public class UserController02 {
	@Autowired
	private UserClient userclient; 
	
	@RequestMapping("/u/{id}")
	public User query(@PathVariable Long id){
	return	userclient.queryID(id);
		
	}
}
