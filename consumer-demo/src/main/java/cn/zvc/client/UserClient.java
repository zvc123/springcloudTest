package cn.zvc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zvc.UserClientFallback;
import cn.zvc.config.FeignConfig;
import cn.zvc.pojo.User;


@FeignClient(value="user-service",fallback=UserClientFallback.class,configuration=FeignConfig.class)
public interface UserClient {
    @RequestMapping("/user/{id}")
	User queryID(@PathVariable("id") Long id);
}
