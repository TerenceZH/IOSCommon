package com.model;

import java.io.Serializable;

public class CashPayBillItem implements Serializable{
	private String id;
	private String cashPayBillNo;
	private String item;
	private double money;
	private String desc;
	public CashPayBillItem(String id, String cashPayBillNo, String item,
			double money, String desc) {
		super();
		this.id = id;
		this.cashPayBillNo = cashPayBillNo;
		this.item = item;
		this.money = money;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCashPayBillNo() {
		return cashPayBillNo;
	}
	public void setCashPayBillNo(String cashPayBillNo) {
		this.cashPayBillNo = cashPayBillNo;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
