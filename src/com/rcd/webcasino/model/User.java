package com.rcd.webcasino.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {
	
	private String name = null;
	private String surname1 = null;
	private String surname2 = null;
	private String username = null;
	private String password = null;
	private String userid = null;
	private Date birthdate = null;
	private Double walllet = null;
	
//	public User (String surname1, String surname2) {
//		
//		this(surname1, surname2, null, null);
//		
//	}
//	
//	public User (String userid, String password, String username, String name) {
//		
//		this(userid, password, username, name, null);
//	
//	}
//	
//	public User(String userid, String password, String username, String name, String surname1, String surname2) {
//		setName(name);
//		setSurname1(surname1);
//		setSurname2(surname2);
//		setUserid(userid);
//		setPassword(password);
//		setUsername(username);
//	}
//		
//	public User(String userid2, String password2, String username2, String name2, Object object) {
//	}
	
	public User() {
		
	}

	public String getName() {
	
		return name;
	
	}
	
	public void setName(String name) {
	
		this.name = name;
	
	}
	
	public String getSurname1() {
	
		return surname1;
	
	}
	
	public void setSurname1(String surname1) {
	
		this.surname1 = surname1;
	
	}
	
	public String getSurname2() {
	
		return surname2;
	
	}
	
	public void setSurname2(String surname2) {
	
		this.surname2 = surname2;
	
	}
	
	public String getUsername() {
	
		return username;
	
	}
	
	public void setUsername(String username) {
	
		this.username = username;
	
	}
	
	public String getPassword() {

		return password;
	
	}
	
	public void setPassword(String password) {
	
		this.password = password;
	
	}
	
	public String getUserid() {
	
		return userid;
		
	}
	
	public void setUserid(String userid) {
	
		this.userid = userid;
	
	}
	
	public Double getWalllet() {
	
		return walllet;
	
	}
	
	public void setWalllet(Double walllet) {
	
		this.walllet = walllet;
	}
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString(this);
	}
}