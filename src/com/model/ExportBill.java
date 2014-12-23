package com.model;

import java.io.Serializable;

public class ExportBill implements Serializable{
	private String no;
	private String customerNo;
	private String businessNo;
	private String warehouseNo;
	private String operatorNo;
	private double preTotal;
	private double discount;
	private double djq;
	private double postTotal;
	private String desc;
	private String time;
	private int isApproved;
	private int type;
	
	public ExportBill() {
		// TODO Auto-generated constructor stub
	}

	

	public ExportBill(String no, String customerNo, String businessNo,
			String warehouseNo, String operatorNo, double preTotal,
			double discount, double djq, double postTotal, String desc,
			String time, int isApproved, int type) {
		super();
		this.no = no;
		this.customerNo = customerNo;
		this.businessNo = businessNo;
		this.warehouseNo = warehouseNo;
		this.operatorNo = operatorNo;
		this.preTotal = preTotal;
		this.discount = discount;
		this.djq = djq;
		this.postTotal = postTotal;
		this.desc = desc;
		this.time = time;
		this.isApproved = isApproved;
		this.type = type;
	}



	public double getPostTotal() {
		return postTotal;
	}



	public void setPostTotal(double postTotal) {
		this.postTotal = postTotal;
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

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
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

	public double getPreTotal() {
		return preTotal;
	}

	public void setPreTotal(double preTotal) {
		this.preTotal = preTotal;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDjq() {
		return djq;
	}

	public void setDjq(double djq) {
		this.djq = djq;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	



	
}
