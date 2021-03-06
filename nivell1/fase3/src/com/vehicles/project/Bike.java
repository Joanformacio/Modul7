package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception{
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontBackWheels) throws Exception {
		addTwoWheels(frontBackWheels);
		
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel frontWheel = wheels.get(0);
		Wheel backWheel = wheels.get(1);

		if (!frontWheel.equals(backWheel))
			throw new Exception();

		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}
	

}
