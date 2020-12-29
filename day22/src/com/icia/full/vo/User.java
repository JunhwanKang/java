package com.icia.full.vo;

public class User {
	private String email;
	private String password;
	private String name;
	public User(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}
	public User() {
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	
}
