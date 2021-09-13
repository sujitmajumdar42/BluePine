package com.cipheric.bluepine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE_DETAIL")
public class PurchaseDetail {
	
	@Id
	@Column(name="PURCHASEID")
	private String purchaseId;
	
	@Id
	@Column(name="ITEMID")
	private String itemId;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="COST")
	private float cost;

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
