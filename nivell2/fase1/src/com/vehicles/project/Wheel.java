package com.vehicles.project;

import com.vehicles.processexceptions.ControlImputs;
import com.vehicles.processexceptions.ExceptionVehicles;

public class Wheel {
	private String brand;
	private double diameter;
	private String typeVehicle;

	public Wheel(String typeVehicle,String brand, double diameter) throws Exception, ExceptionVehicles {
		
		if (brand.equals("") || brand==null) throw new Exception();
		if(typeVehicle.equals("")) throw new Exception("The field type Vehicle can not to be empty");
		if (typeVehicle.equals("car") || typeVehicle.equals("bike")) {
			if (ControlImputs.ControlDiameterCar(diameter)) throw new ExceptionVehicles("diametercar");
		}else if(typeVehicle.equals("truck")){
			if (ControlImputs.ControlDiameterTruck(diameter)) throw new ExceptionVehicles("diametertruck");
		}
		this.typeVehicle= typeVehicle;
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
		builder.append(", type Vehicle=");
		builder.append(typeVehicle);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
