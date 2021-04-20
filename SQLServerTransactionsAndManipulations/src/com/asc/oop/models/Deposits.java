package com.asc.oop.models;

import java.sql.Date;

public class Deposits {
	private int DId;
	private String name;
	private Double AmountIn;
	private String recurring;
	private String howOften;
	private Date createdDate;
	private int UserId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmountIn() {
		return AmountIn;
	}
	public void setAmountIn(Double amountIn) {
		AmountIn = amountIn;
	}
	public String getRecurring() {
		return recurring;
	}
	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}
	public String getHowOften() {
		return howOften;
	}
	public void setHowOften(String howOften) {
		this.howOften = howOften;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getDId() {
		return DId;
	}
	public int getUserId() {
		return UserId;
	}
	
	
}
