package com.vehicles.project;

import java.util.*;
import com.vehicles.processexceptions.ControlImputs;
import com.vehicles.processexceptions.ExceptionVehicles;


public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception, ExceptionVehicles {
		
		if (plate.equals("")) throw new Exception();
		if (brand.equals("")) throw new Exception();
		if (color.equals("")) throw new Exception();
		if(ControlImputs.ControlPlate(plate)) throw new ExceptionVehicles("plate");
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public  String getListWheels() {
		StringBuilder builder = new StringBuilder();
		for (Wheel w:wheels) {
			
			builder.append(w.toString());
			
		}
		
		return builder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [plate=");
		builder.append(plate);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", color=");
		builder.append(color);
		builder.append(", wheels=");
		builder.append(getListWheels());
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
