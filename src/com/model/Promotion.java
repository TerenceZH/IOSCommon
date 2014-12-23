package com.model;

import java.io.Serializable;

public class Promotion implements Serializable{
	private String id;
	private String tablename;
	
	public Promotion(){
		
	}

	
	public Promotion(String id, String tablename) {
		super();
		this.id = id;
		this.tablename = tablename;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTablename() {
		return tablename;
	}


	public void setTablename(String tablename) {
		this.tablename = tablename;
	}


	
	
	

}
