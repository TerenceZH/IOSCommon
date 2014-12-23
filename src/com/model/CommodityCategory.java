package com.model;

import java.io.Serializable;

public class CommodityCategory implements Serializable{
	private String no;//000-999
	private String name;
	private String parentNo;//×î¶¥²ãµÄÎª000  

	public CommodityCategory() {
		// TODO Auto-generated constructor stub
	}

	public CommodityCategory(String no, String name, String parentNo) {
		super();
		this.no = no;
		this.name = name;
		this.parentNo = parentNo;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentNo() {
		return parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}

	

	
}
