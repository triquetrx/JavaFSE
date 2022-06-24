package com.cts.engineAnalysis;

public class Car {

	private String name;
	private Engine engine;

	// Type your code here

	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}

	public void getReport() {

		System.out.println(
				name + " car with " + engine.getFuel() + " engine gives " + engine.getPerformance() + " horsepower");
	}

}
