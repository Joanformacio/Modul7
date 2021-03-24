package com.vehicles.view;
import com.vehicles.helper.Introducedates;
import com.vehicles.helper.TypeLicense;
import com.vehicles.project.*;

import java.util.*;

import javax.swing.JOptionPane;






public class Main {

	public static void main(String[] args) {
		int option;
		OwnerDriver driver1;
		
		
		option= Integer.parseInt(JOptionPane.showInputDialog("Select type vehicle, 1-car, 0-Bike, 2- Truck")) ;
		
		try {
			 Driver driver;
			 driver1=Managedriver.CreateOwnDriver();
			License licenseDriver1 = driver1.getLicense();
			TypeLicense typelicenseDriver1 = licenseDriver1.getTypeLicense();
			SelecttypeVehicle.managementVehicle(option, typelicenseDriver1);
			int resp=JOptionPane.showConfirmDialog(null,"Is owner of vehicle the same driver?");
		      if (JOptionPane.OK_OPTION == resp){
		    	  System.out.println("Thank you");
		      }
		      else{
		    	 License driverLicense = new License(TypeLicense.BE, Introducedates.CreateDates(1998, 06, 16), true, false);
		    	  driver = new Driver("Pedro", "Sanchez", Introducedates.CreateDates(1980, 06, 03), driverLicense); 
		    	   System.out.println(driver);// aquí no da problemas, no acabo de entender,, porque hay problemas de scope en un try..catch
		      }
		      System.out.println(driver1);
		     // System.out.println(driver); si lo llamo aquí, da problemas
		      
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
