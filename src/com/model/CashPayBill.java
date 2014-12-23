package com.model;

import java.io.Serializable;

public class CashPayBill implements Serializable{
	private String no;
	private String operatorNo;
	private String accountName;
	private double total;
	public CashPayBill(String no, String operatorNo, String accountName,
			double total) {
		super();
		this.no = no;
		this.operatorNo = operatorNo;
		this.accountName = accountName;
		this.total = total;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getOperatorNo() {
		return operatorNo;
	}
	public void setOperatorNo(String operatorNo) {
		this.operatorNo = operatorNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
