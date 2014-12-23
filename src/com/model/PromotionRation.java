package com.model;

import java.io.Serializable;

public class PromotionRation implements Serializable{
	private String id;
	private String promotionId;
	private String promotionId2;
	
	public PromotionRation(String id, String promotionId, String promotionId2) {
		super();
		this.id = id;
		this.promotionId = promotionId;
		this.promotionId2 = promotionId2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getPromotionId2() {
		return promotionId2;
	}
	public void setPromotionId2(String promotionId2) {
		this.promotionId2 = promotionId2;
	}
	
	

}
