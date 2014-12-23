package com.model;

import java.io.Serializable;

public class User implements Serializable{
	private String id;
	private String username;
	private String password;
	private int type;//0=系统管理员 1=库存管理员 2=进销人员 3=财务人员 4=总经理
	private int getTopAuthority;//获得最高权限 ?1:0

	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String id, String username, String password, int type,
			int getTopAuthority) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
		this.getTopAuthority = getTopAuthority;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public int getGetTopAuthority() {
		return getTopAuthority;
	}



	public void setGetTopAuthority(int getTopAuthority) {
		this.getTopAuthority = getTopAuthority;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	

}
