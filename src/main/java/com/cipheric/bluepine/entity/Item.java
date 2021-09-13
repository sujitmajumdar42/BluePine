package com.cipheric.bluepine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {
	
	@Id
	@Column(name = "ITEMID")
	private String itemId;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "METRIC")
	private String metric;
	
	@Column(name = "LAST_MODIFIED")
	private String lastModified;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(" Item Information[ID=").append(this.itemId)
				.append(" CATEGORY=").append(this.category)
				.append(" NAME=").append(this.name)
				.append(" METRIC=").append(this.metric)
				.append(" LAST_MODIFIED=").append(this.lastModified)
				.append("]").toString();
	}
	
}
