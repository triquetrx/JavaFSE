package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

	@Override
	public int getPerformance() {
		// TODO Auto-generated method stub
		return (int)((super.getTorque()*super.getRpm())/63025);
	}	

}
