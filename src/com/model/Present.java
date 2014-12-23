package com.model;

import java.io.Serializable;

public class Present implements Serializable{
	private String id;
	private String commodityNo;
	private String giveNo;
	private String startTime;
	private String endTime;
	private int compatible;
	private String effectiveTime;
	
	public Present(String id, String commodityNo, String giveNo,
			String startTime, String endTime, int compatible,
			String effectiveTime) {
		super();
		this.id = id;
		this.commodityNo = commodityNo;
		this.giveNo = giveNo;
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
	public String getGiveNo() {
		return giveNo;
	}
	public void setGiveNo(String giveNo) {
		this.giveNo = giveNo;
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
