package com.vehicles.processexceptions;



public class ControlImputs {

	

	public static boolean ControlPlate(String plate) {
		
		boolean plateMistake=false;
		
		if (plate.length()>7) {
			plateMistake=true;
		}
		
		for (int i=0; i<plate.length()-1;i++) {
			int digit= (int) plate.charAt(i);
			if (i<3 && digit<48 && digit>57) {
				plateMistake=true;
			}
			
			if(i>3 && (digit<65 && digit>90) || (digit<97 && digit>120)) {
				plateMistake=true;
			}
		}
		
		return plateMistake;
		
	}
	
	public  static boolean ControlDiameter(double diameter) {
		boolean diameterMistake=false;
		if (diameter<0.4 || diameter>4) {
			diameterMistake=true;
		}
		
		
		return diameterMistake;
	}
}
