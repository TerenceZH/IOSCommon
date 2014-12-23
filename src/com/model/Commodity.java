package com.model;

import java.io.Serializable;

public class Commodity implements Serializable{
	private String no;
	private String name;
	private String style;
	private String category;
	private int quantity;
	private double inPrice;
	private double outPrice;
	private double lastInPrice;
	private double lastOutPrice;
	private double stockAvgPrice;
	private int warningQuantity;

	public Commodity() {
		// TODO Auto-generated constructor stub
	}

	public Commodity(String no, String name, String style, String category,
			int quantity, double inPrice, double outPrice, double lastInPrice,
			double lastOutPrice, double stockAvgPrice, int warningQuantity) {
		super();
		this.no = no;
		this.name = name;
		this.style = style;
		this.category = category;
		this.quantity = quantity;
		this.inPrice = inPrice;
		this.outPrice = outPrice;
		this.lastInPrice = lastInPrice;
		this.lastOutPrice = lastOutPrice;
		this.stockAvgPrice = stockAvgPrice;
		this.warningQuantity = warningQuantity;
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getInPrice() {
		return inPrice;
	}

	public void setInPrice(double inPrice) {
		this.inPrice = inPrice;
	}

	public double getOutPrice() {
		return outPrice;
	}

	public void setOutPrice(double outPrice) {
		this.outPrice = outPrice;
	}

	public double getLastInPrice() {
		return lastInPrice;
	}

	public void setLastInPrice(double lastInPrice) {
		this.lastInPrice = lastInPrice;
	}

	public double getLastOutPrice() {
		return lastOutPrice;
	}

	public void setLastOutPrice(double lastOutPrice) {
		this.lastOutPrice = lastOutPrice;
	}

	public double getStockAvgPrice() {
		return stockAvgPrice;
	}

	public void setStockAvgPrice(double stockAvgPrice) {
		this.stockAvgPrice = stockAvgPrice;
	}

	public int getWarningQuantity() {
		return warningQuantity;
	}

	public void setWarningQuantity(int warningQuantity) {
		this.warningQuantity = warningQuantity;
	}

	
	
}
