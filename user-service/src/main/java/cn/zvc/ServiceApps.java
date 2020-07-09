package cn.zvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.zvc.mapper")
@EnableDiscoveryClient //开启eureka服务发现功能
public class ServiceApps {

	
	public static void main(String[] args) {
		SpringApplication.run(ServiceApps.class);
	}
}
