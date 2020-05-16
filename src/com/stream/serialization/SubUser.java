package com.stream.serialization;

public class SubUser extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2315852129576181054L;
	
	private String address;

	
	public SubUser() {
		super();
	}

	public SubUser(String userName, String userPwd) {
		super(userName, userPwd);
	}

	public SubUser(String userName, String userPwd, String address) {
		super(userName,userPwd);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return super.toString() + ", SubUser [address=" + address + "]";
	}

}
