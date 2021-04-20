package com.asc.oop.models;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Expenses {

	private int expId;
	private String ExpName;
	private double cost;
	private String recurring;
	private String howOften;
	private Date CreatedDate;
	private int usedId;
	
	public int getExpId() {
		return expId;
	}

	public String getExpName() {
		return ExpName;
	}
	public void setExpName(String expName) {
		ExpName = expName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
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
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
	public int getUsedId() {
		return usedId;
	}
	public void setUsedId(int usedId) {
		this.usedId = usedId;
	}
}
