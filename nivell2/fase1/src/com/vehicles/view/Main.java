package com.vehicles.view;

import javax.swing.JOptionPane;






public class Main {

	public static void main(String[] args) {
		int option;
		option= Integer.parseInt(JOptionPane.showInputDialog("Select type vehicle, 1-car, 0-Bike")) ;
		
		try {
			SelecttypeVehicle.managementVehicle(option);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
