package cn.zvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@RestController
@DefaultProperties(defaultFallback="finByID1")
public class UserController01 {
    
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/uu/{id}")
	//@HystrixCommand(fallbackMethod="finByID")
	@HystrixCommand
	public String findById(@PathVariable Long id){
		/*String url="http://localhost:9091/user/"+id;
		List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
		ServiceInstance serviceInstance = instances.get(0);
		System.out.println(serviceInstance.getHost());
		
		url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/"+"user/"+id;*/
		String url="http://user-service/user/"+id;
	    String user = restTemplate.getForObject(url, String.class);
		return user.toString();
	}
	
	public String finByID(Long id){
    
		
		return "网络拥挤，请稍后再试";
	}
	
	public String finByID1(){
		
		return "默认提示：网络拥挤";
	}
}
