package com.vehicles.view;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.helper.IntroduceDataVehicles;
import com.vehicles.project.Car;
import com.vehicles.project.Wheel;
import com.vehicles.project.Bike;

public  class SelecttypeVehicle {
	
	public static void managementVehicle (int option) throws Exception{
		//if the user don't insert a correct value
		if (option!=0 && option!=1) throw new Exception("Only need two options: 1- select a car, 0- Select a Bike");
		Car miCar;
		Bike miBike;
		String plate, brand, color;
		Wheel frontWheel;
		Wheel backWheel;
		
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		switch (option) {
			//If select a option car
			case 1:
				
					plate=IntroduceDataVehicles.setPlate();
					brand=IntroduceDataVehicles.setbrand();
					color= IntroduceDataVehicles.setColor();	
					miCar = new Car(plate, brand, color);
					frontWheel= IntroduceDataVehicles.myWheels("Introduce brand of front wheel", "Introduce diameter of front wheel");
					frontWheels.add(frontWheel);
					frontWheels.add(frontWheel);
					backWheel= IntroduceDataVehicles.myWheels("Introduce brand of back wheel", "Introduce diameter of back wheel");
					backWheels.add(backWheel);
					backWheels.add(backWheel);
					miCar.addWheels(frontWheels, backWheels); 
					System.out.println(miCar.toString());
				
				//If select a option Bike	
			case 0:
				
					plate=IntroduceDataVehicles.setPlate();
					brand=IntroduceDataVehicles.setbrand();
					color= IntroduceDataVehicles.setColor();	
					miBike = new Bike(plate, brand, color);
					frontWheel= IntroduceDataVehicles.myWheels("Introduce brand of front wheel", "Introduce diameter of front wheel");
					frontWheels.add(frontWheel);
					frontWheels.add(frontWheel);
					
					miBike.addTwoWheels(frontWheels);
					System.out.println(miBike.toString());
			default:
				System.out.println("Only need two options: 1- select a car, 0- Select a Bike");
		
		}
	}
}
