package com.vehicles.project;

import com.vehicles.processexceptions.ControlImputs;
import com.vehicles.processexceptions.ExceptionVehicles;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception, ExceptionVehicles {
		
		if (brand.equals("") || brand==null) throw new Exception();
		if (ControlImputs.ControlDiameter(diameter)) throw new ExceptionVehicles("diameter");
		this.brand = brand;
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wheel [brand=");
		builder.append(brand);
		builder.append(", diameter=");
		builder.append(diameter);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
