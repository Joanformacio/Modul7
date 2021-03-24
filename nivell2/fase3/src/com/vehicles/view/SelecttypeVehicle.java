package com.vehicles.view;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.helper.IntroduceDataVehicles;
import com.vehicles.helper.TypeLicense;
import com.vehicles.project.*;


public  class SelecttypeVehicle {
	
	public static void managementVehicle (int option, TypeLicense typeLicense) throws Exception{
		//if the user don't insert a correct value
		if (option!=0 && option!=1 && option!=2) throw new Exception("Only need 3 options: 1- select a car, 0- Select a Bike, 2-Select Truck");
		if (typeLicense==null) throw new Exception("The field type License is null");
		Car miCar;
		Bike miBike;
		Truck miTruck;
		String plate, brand, color;
		Wheel frontWheel;
		Wheel backWheel;
		
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		switch (option) {
			//If select a option car
			case 1:
					TypeLicense BE= TypeLicense.BE;
					TypeLicense B= TypeLicense.B;
					
					if(typeLicense!= BE && typeLicense!=B ) throw new Exception("the driver can't drive a car");
					
					plate=IntroduceDataVehicles.setPlate();
					brand=IntroduceDataVehicles.setbrand();
					color= IntroduceDataVehicles.setColor();	
					miCar = new Car(plate, brand, color);
					
					frontWheel= IntroduceDataVehicles.myWheels("Introduce type vehicle","Introduce brand of front wheel", "Introduce diameter of front wheel");
					frontWheels.add(frontWheel);
					frontWheels.add(frontWheel);
					
					backWheel= IntroduceDataVehicles.myWheels("Introduce type vehicle","Introduce brand of back wheel", "Introduce diameter of back wheel");
					backWheels.add(backWheel);
					backWheels.add(backWheel);
					
					miCar.addWheels(frontWheels, backWheels); 
					System.out.println(miCar.toString());
					break;
				//If select a option Bike	
			case 0:
					TypeLicense A= TypeLicense.A;
					TypeLicense A1= TypeLicense.A1;
					TypeLicense A2= TypeLicense.A2;
					//If the driver not to be a License type Bike
					if(typeLicense!= A && typeLicense!=A1 && typeLicense!=A2) throw new Exception("the driver can't drive a Bike");
					
					plate=IntroduceDataVehicles.setPlate();
					brand=IntroduceDataVehicles.setbrand();
					color= IntroduceDataVehicles.setColor();	
					miBike = new Bike(plate, brand, color);
					
					frontWheel= IntroduceDataVehicles.myWheels("Introduce type vehicle","Introduce brand of front wheel", "Introduce diameter of front wheel");
					frontWheels.add(frontWheel);
					frontWheels.add(frontWheel);
					
					miBike.addTwoWheels(frontWheels);
					System.out.println(miBike.toString());
					break;
			case 2:
				TypeLicense C= TypeLicense.C;
				TypeLicense C1E= TypeLicense.C1E;
				TypeLicense CE= TypeLicense.CE;
				if(typeLicense!= C && typeLicense!=C1E && typeLicense!=CE) throw new Exception("the driver can't drive a Truck");
				
				plate=IntroduceDataVehicles.setPlate();
				brand=IntroduceDataVehicles.setbrand();
				color= IntroduceDataVehicles.setColor();	
				miTruck = new Truck(plate, brand, color);
				
				frontWheel= IntroduceDataVehicles.myWheels("Introduce type vehicle","Introduce brand of front wheel", "Introduce diameter of front wheel");
				frontWheels.add(frontWheel);
				frontWheels.add(frontWheel);
				
				backWheel= IntroduceDataVehicles.myWheels("Introduce type vehicle","Introduce brand of back wheel", "Introduce diameter of back wheel");
				backWheels.add(backWheel);
				backWheels.add(backWheel);
				
				miTruck.addWheels(frontWheels, backWheels); 
				System.out.println(miTruck.toString());
				break;
			default:
				System.out.println("Only need two options: 1- select a car, 0- Select a Bike or 2 - Select truck");
				break;
		
		}
	}
}
