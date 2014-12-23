package com.model;

import java.io.Serializable;

public class ImportBill implements Serializable{
	private String no;
	private String customerNo;
	private String warehouseNo;
	private String operatorNo;
	private String desc;
	private double total;
	private String time;
	private int isApproved;
	private int type;
	
	public ImportBill() {
		// TODO Auto-generated constructor stub
	}

	

	public ImportBill(String no, String customerNo, String warehouseNo,
			String operatorNo, String desc, double total, String time,
			int isApproved, int type) {
		super();
		this.no = no;
		this.customerNo = customerNo;
		this.warehouseNo = warehouseNo;
		this.operatorNo = operatorNo;
		this.desc = desc;
		this.total = total;
		this.time = time;
		this.isApproved = isApproved;
		this.type = type;
	}



	public int getIsApproved() {
		return isApproved;
	}



	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getWarehouseNo() {
		return warehouseNo;
	}

	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}

	public String getOperatorNo() {
		return operatorNo;
	}

	public void setOperatorNo(String operatorNo) {
		this.operatorNo = operatorNo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

	

	
}
