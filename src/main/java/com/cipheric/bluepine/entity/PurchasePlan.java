package com.cipheric.bluepine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE_PLAN")
public class PurchasePlan {
	
	@Id
	@Column(name = "PLANID")
	private String planId;
	
	@Id
	@Column(name = "ITEMID")
	private String itemId;
	
	@Column(name="QUANTITY")
	private Integer quantity;
	
	@Column(name="PLAN_DATE")
	private String planDate;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPlanDate() {
		return planDate;
	}

	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}
	
}
