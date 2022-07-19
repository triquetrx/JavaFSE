package com.service;

import org.springframework.stereotype.Service;

import com.model.Construction;

//use appropriate annotation to configure ConstructionService as Service
@Service
public class ConstructionService {
	
	//Calculating the cost
	public double calculateConstructionCost(Construction obj)
	{
		//Initializing the variable to store the result
		double totalCost=0.0;
		//fill the code
		//Iterating on the basis of Brick Type and then calculating the result
		if(obj.getBricksType().equalsIgnoreCase("UnburntClayBricks")) {
			obj.setCostPerSqFt(340.00);
			totalCost = obj.getCostPerSqFt()*obj.getBuildupArea();
		} else if(obj.getBricksType().equalsIgnoreCase("BurntClayBricks")) {
			obj.setCostPerSqFt(390.00);
			totalCost = obj.getCostPerSqFt()*obj.getBuildupArea();
		} else {
			obj.setCostPerSqFt(300.00);
			totalCost = obj.getCostPerSqFt()*obj.getBuildupArea();
		}
		return totalCost;
	}

}
