package com.dxc.pojo;

public class AdminPojo {
	private int id;
	private String name;
	private String Password;
	public AdminPojo() {
	}
	public AdminPojo(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.Password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}

