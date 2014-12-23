package com.model;

import java.io.Serializable;

public class Customer implements Serializable{
	private String no;
	private int type;//type==0?进货商:销售商
	private int level;//level 1-5 need pts 1,200,2000,10000,80000
	private int point;//1 yuan =1 pt,单次结算四舍五入
	private String name;
	private String phone;
	private String address;
	private String zip;
	private String mail;
	private double max;
	private double to_get;
	private double to_pay;
	private String businessmanNo;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String no, int type, int level, int point, String name,
			String phone, String address, String zip, String mail, double max,
			double to_get, double to_pay, String businessmanNo) {
		super();
		this.no = no;
		this.type = type;
		this.level = level;
		this.point = point;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.zip = zip;
		this.mail = mail;
		this.max = max;
		this.to_get = to_get;
		this.to_pay = to_pay;
		this.businessmanNo = businessmanNo;
	}



	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getTo_get() {
		return to_get;
	}

	public void setTo_get(double to_get) {
		this.to_get = to_get;
	}

	public double getTo_pay() {
		return to_pay;
	}

	public void setTo_pay(double to_pay) {
		this.to_pay = to_pay;
	}

	public String getBusinessmanNo() {
		return businessmanNo;
	}

	public void setBusinessmanNo(String businessmanNo) {
		this.businessmanNo = businessmanNo;
	}


	
	
}