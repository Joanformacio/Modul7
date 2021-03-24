package com.vehicles.view;

import java.util.*;


import com.vehicles.project.*;
import com.vehicles.helper.IntroduceDataVehicles;



public class Main {

	public static void main(String[] args) {
		
		String plate, brand, color;
		Wheel frontWheel;
		Wheel backWheel;
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		plate=IntroduceDataVehicles.setPlate();
		brand=IntroduceDataVehicles.setbrand();
		color= IntroduceDataVehicles.setColor();
		
		Car miCar= new Car(plate, brand, color);
		
		frontWheel= IntroduceDataVehicles.myWheels("Introduce brand of front wheel", "Introduce diameter of front wheel");
		frontWheels.add(frontWheel);
		frontWheels.add(frontWheel);
		backWheel= IntroduceDataVehicles.myWheels("Introduce brand of back wheel", "Introduce diameter of back wheel");
		backWheels.add(backWheel);
		backWheels.add(backWheel);
		
		try {
			miCar.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println(miCar.toString());
	}

}
