package com.vehicles.processexceptions;
import java.lang.Exception;




public class ExceptionVehicles extends Exception{
	
	
	private String typeError;
	public  ExceptionVehicles (String tipoError) {
		super();
		
			this.typeError=tipoError;
			
	}
	
	@Override
	public String getMessage() {
		String mensaje="";
		switch(typeError) {
		
		case "plate":
			mensaje= "Wrong plate, It would to be '0000AAA' ";
			break;
		case "diametercar":
			mensaje= "The diameter can't to be low 0.4 and up to 4";
			break;
		case "diametertruck":
			mensaje= "The diameter can't to be low 4 and up to 8";
			break;
		}
		
		return mensaje;
	}

}
