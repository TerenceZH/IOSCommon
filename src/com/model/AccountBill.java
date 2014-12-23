package com.model;

import java.io.Serializable;


public class AccountBill implements Serializable{
	
	private String no;
	private int type;
	private String customerNo;
	private String operatorNo;
	private double total;
	private String time;
	private int isApproved;
	
	public AccountBill(){}

	public AccountBill(String no, int type, String customerNo,
			String operatorNo, double total, String time, int isApproved) {
		super();
		this.no = no;
		this.type = type;
		this.customerNo = customerNo;
		this.operatorNo = operatorNo;
		this.total = total;
		this.time = time;
		this.isApproved = isApproved;
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

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getOperatorNo() {
		return operatorNo;
	}

	public void setOperatorNo(String operatorNo) {
		this.operatorNo = operatorNo;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}
	
	
	
	
	

}
