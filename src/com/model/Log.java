package com.model;

import java.io.Serializable;

public class Log implements Serializable{
	private String id;
	private String type;//types = {"商品","商品分类","客户","账户","进销","收付款","促销","用户"};
	private String desc;
	private String time;
	private String operatorNo;

	public Log() {
		// TODO Auto-generated constructor stub
	}

	
	
	


	
	public Log(String id, String type, String desc, String time,
			String operatorNo) {
		super();
		this.id = id;
		this.type = type;
		this.desc = desc;
		this.time = time;
		this.operatorNo = operatorNo;
	}







	public String getOperatorNo() {
		return operatorNo;
	}







	public void setOperatorNo(String operatorNo) {
		this.operatorNo = operatorNo;
	}







	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
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



	public Object getLogValue(int columnNumber){
		switch (columnNumber){
			case 0:
				return getType();
			case 1:
				return getTime();
			case 2:
				return getDesc();
			default:
				return "";
		}
	
	}
	

}
