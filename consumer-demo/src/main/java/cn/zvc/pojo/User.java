package cn.zvc.pojo;

import java.io.Serializable;



import lombok.Data;


public class User implements Serializable{ 
	private Long id;
	private String userName; // 用户名 
	private String password; // 密码 
	private String name;// 姓名
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
