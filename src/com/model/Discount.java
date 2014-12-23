package com.model;

import java.io.Serializable;

public class Discount implements Serializable{
	private String id;
	private String commodityNo;
	private int customerLevel;
	private double rate;
	private String startTime;
	private String endTime;
	private int compatible;
	private String effectiveTime;
	public Discount(String id, String commodityNo, int customerLevel,
			double rate, String startTime, String endTime, int compatible,
			String effectiveTime) {
		super();
		this.id = id;
		this.commodityNo = commodityNo;
		this.customerLevel = customerLevel;
		this.rate = rate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.compatible = compatible;
		this.effectiveTime = effectiveTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public int getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(int customerLevel) {
		this.customerLevel = customerLevel;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getCompatible() {
		return compatible;
	}
	public void setCompatible(int compatible) {
		this.compatible = compatible;
	}
	public String getEffectiveTime() {
		return effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	

}
