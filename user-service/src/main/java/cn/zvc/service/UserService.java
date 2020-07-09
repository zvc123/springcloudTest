package cn.zvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zvc.mapper.UserMapper;
import cn.zvc.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User queryById(Long id){
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return userMapper.selectByPrimaryKey(id);
	}
	
}
