package com.rcd.webcasino.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Cart {
	
	private String product = null;
	private Integer productamo = null;
	private Double totalprice = null;
	private Date date = null;
	
	
	public String getProduct() {
		
		return product;
		
	}
	
	public void setProduct(String product) {
		
		this.product = product;
	
	}
	
	public Integer getProductamo() {
	
		return productamo;
	
	}
	
	public void setProductamo(Integer productamo) {
	
		this.productamo = productamo;
	
	}
	
	public Double getTotalprice() {
	
		return totalprice;
	
	}
	
	public void setTotalprice(Double totalprice) {
	
		this.totalprice = totalprice;
	
	}
	
	public Date getDate() {
	
		return date;
	
	}
	
	public void setDate(Date date) {
	
		this.date = date;
	
	}
	
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString(this);
	}
}
