package com.vehicles.helper;
import com.vehicles.project.Wheel;
import javax.swing.JOptionPane;


public class IntroduceDataVehicles {
	private static String wheel, typeVehicle;
	private static double  diameter;
	protected static String plate, brand, color;
	
	public static Wheel myWheels(String msgQuestion0,String msgQuestion1, String msgQuestion2) throws Exception {
		typeVehicle = JOptionPane.showInputDialog(msgQuestion0);
		wheel = JOptionPane.showInputDialog(msgQuestion1);
		diameter = Double.parseDouble(JOptionPane.showInputDialog(msgQuestion2));
		return new Wheel(typeVehicle,wheel, diameter);
	}
	
	public static String setPlate() {
		return plate=JOptionPane.showInputDialog("Introduce the plate of your vehicle");
	}
	
	public static  String setbrand() {
		return brand=JOptionPane.showInputDialog("Introduce the brand of your vehicle");
	}
	
	public static String setColor() {
		return color=JOptionPane.showInputDialog("Introduce the color of your vehicle");
	}
	
	
}
