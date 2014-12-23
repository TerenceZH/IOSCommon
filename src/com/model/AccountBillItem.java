package com.model;

import java.io.Serializable;

public class AccountBillItem implements Serializable{
	private String id;
	private String accountBillNo;
	private String name;
	private double money;
	private String descString;
	public AccountBillItem(String id, String accountBillNo, String name,
			double money, String descString) {
		super();
		this.id = id;
		this.accountBillNo = accountBillNo;
		this.name = name;
		this.money = money;
		this.descString = descString;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountBillNo() {
		return accountBillNo;
	}
	public void setAccountBillNo(String accountBillNo) {
		this.accountBillNo = accountBillNo;
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
	public String getDescString() {
		return descString;
	}
	public void setDescString(String descString) {
		this.descString = descString;
	}
	
	

}
