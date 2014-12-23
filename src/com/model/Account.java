package com.model;

import java.io.Serializable;

public class Account implements Serializable{
	private String id;
	private String name;
	private double money;
	private String setTime;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	

	public Account(String id, String name, double money, String setTime) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.setTime = setTime;
	}






	public String getSetTime() {
		return setTime;
	}






	public void setSetTime(String setTime) {
		this.setTime = setTime;
	}






	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	
}
