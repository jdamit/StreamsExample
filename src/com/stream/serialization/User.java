package com.stream.serialization;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7168925011876648430L;
	
	private String userName;
	private transient String userPwd;
	
	public static final int MIN_AGE = 18;
	public static final int MAX_AGE = 25;
	
	public User() {
		super();
	}

	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public static int getMinAge() {
		return MIN_AGE;
	}

	public static int getMaxAge() {
		return MAX_AGE;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + ", MIN_AGE="+ MIN_AGE + ", MAX_AGE=" + MAX_AGE + "]";
	}
	

}
