package cn.zvc;

import org.springframework.stereotype.Component;

import cn.zvc.client.UserClient;
import cn.zvc.pojo.User;

@Component
public class UserClientFallback implements UserClient {

	@Override
	public User queryID(Long id) {
		User user=new User();
		user.setName("异常");
		return user;
	}

}
