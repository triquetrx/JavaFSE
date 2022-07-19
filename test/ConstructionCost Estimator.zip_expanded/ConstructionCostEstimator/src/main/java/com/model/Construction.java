package com.model;

import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;

//use appropriate annotation to configure the Construction class as Component
@Component
public class Construction {
	
	//Model Attribute
	private String bricksType;
	//Validation for BuildUp Area if less than 500 then don't allow
	@Min(value=500, message="Buildup Area should be minimum 500")
	private double buildupArea;
	private double costPerSqFt;
	
	public String getBricksType() {
		return bricksType;
	}
	public void setBricksType(String bricksType) {
		this.bricksType = bricksType;
	}
	public double getBuildupArea() {
		return buildupArea;
	}
	public void setBuildupArea(double buildupArea) {
		this.buildupArea = buildupArea;
	}
	public double getCostPerSqFt() {
		return costPerSqFt;
	}
	public void setCostPerSqFt(double costPerSqFt) {
		this.costPerSqFt = costPerSqFt;
	}
	
	

}
