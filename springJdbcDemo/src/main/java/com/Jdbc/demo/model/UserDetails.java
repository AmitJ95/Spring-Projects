package com.Jdbc.demo.model;

public class UserDetails {

	private int userid;
	private String username;
	
	
	public UserDetails(int userid, String username) {
		setUserid(userid);
		setUsername(username);
		
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
