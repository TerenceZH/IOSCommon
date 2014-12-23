package com.model;

import java.io.Serializable;

public class PortBillItem implements Serializable{
	
	//commodity list in the JHD & XSD
	private String id;
	private String portNo;
	private String commodityNo;
	private int quantity;
	private double price;
	private double total;
	private String desc;
	
	public PortBillItem(String id, String portNo, String commodityNo,
			int quantity, double price, double total, String desc) {
		super();
		this.id = id;
		this.portNo = portNo;
		this.commodityNo = commodityNo;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPortNo() {
		return portNo;
	}

	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}

	public String getCommodityNo() {
		return commodityNo;
	}

	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
		
	
		

}
