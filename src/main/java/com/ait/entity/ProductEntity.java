package com.ait.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Products")
public class ProductEntity implements Serializable{

	@Id
	@Column(name = "Product_id")
	private Integer productid;

	@Column(name = "product_Name")
	private String productName;

	private Integer quantity;

	@Column(name = "unitPrice")
	private Double unitPrice;

	@Column(name = "creation_On")
	@CreationTimestamp
	private LocalDateTime creationOn;

	@Column(name = "update_on")
	@UpdateTimestamp
	private LocalDateTime updateOn;

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDateTime getCreationOn() {
		return creationOn;
	}

	public void setCreationOn(LocalDateTime creationOn) {
		this.creationOn = creationOn;
	}

	public LocalDateTime getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDateTime updateOn) {
		this.updateOn = updateOn;
	}

}
