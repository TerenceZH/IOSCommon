package com.model;

import java.io.Serializable;

public class StockBill implements Serializable{
	private String id;
	private int type;//0=报溢单，1=报损单，2=报警但，3=赠送但
	private String commodityNo;
	private int quantity;
	private String time;
	private int isApproved;
	
	

	public StockBill() {
		// TODO Auto-generated constructor stub
	}
	
	

	



	public StockBill(String id, int type, String commodityNo, int quantity,
			String time, int isApproved) {
		super();
		this.id = id;
		this.type = type;
		this.commodityNo = commodityNo;
		this.quantity = quantity;
		this.time = time;
		this.isApproved = isApproved;
	}







	public String getCommodityNo() {
		return commodityNo;
	}







	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}







	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
