package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

	@Override
	public int getPerformance() {
		// TODO Auto-generated method stub
		return (int)((super.getTorque()*super.getRpm())/5252);
	}
}
