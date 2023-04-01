package com.masaiproject.model;

public class HOD {
	private int hodId;
	private String name;
	private String userName;
	private String password;
	
	public HOD() {
		
	}

	public int getHodId() {
		return hodId;
	}

	public void setHodId(int hodId) {
		this.hodId = hodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "HOD [hodId=" + hodId + ", name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}

	public HOD(int hodId, String name, String userName, String password) {
		super();
		this.hodId = hodId;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	

}
