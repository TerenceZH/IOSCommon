package com.model;

import java.io.Serializable;

import javax.swing.JButton;


public class Message implements Serializable{
	private String id;
	private String from;
	private String to;
	private String text;
	private String time;
	private int isRead;



	


	public Message(String id, String from, String to, String text, String time,
			int isRead) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.text = text;
		this.time = time;
		this.isRead = isRead;
	}



	public String getFrom() {
		return from;
	}



	public String getTo() {
		return to;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public  String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public int getIsRead() {
		return isRead;
	}



	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	
	

}
