package com.cipheric.bluepine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VENDOR")
public class Vendor {
	
	@Id
	@Column(name = "VENDORID")
	private String vendorId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LAST_MODIFIED")
	private String lastModified;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	
}
