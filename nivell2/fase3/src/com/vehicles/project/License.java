package com.vehicles.project;

import java.util.Date;

import com.vehicles.helper.TypeLicense;

public class License {
	static int ID_LICENSE=1;
	private TypeLicense typeLicense;
	private  Date ExpiryLicense;
	private boolean carInsurance;
	private boolean ownGarage;
	public License(TypeLicense typeLicense, Date ExpiryLicense, boolean carInsurance, boolean ownGarage) throws Exception {
		
		if(typeLicense==null) throw new Exception("Type License can not to be empty");
		if(ExpiryLicense==null) throw new Exception("Type License can not to be empty");
		
		
		this.typeLicense=typeLicense;
		this.ExpiryLicense=ExpiryLicense;
		this.carInsurance=carInsurance;
		this.ownGarage=ownGarage;
		ID_LICENSE+=1;
	}
	
	
	public TypeLicense getTypeLicense() {
		return typeLicense;
	}


	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("License [ID_License=");
		builder.append(ID_LICENSE);
		builder.append(", Type License=");
		builder.append(typeLicense);
		builder.append(", ExpiryLicense=");
		builder.append(ExpiryLicense);
		builder.append(", carInsurance=");
		builder.append(carInsurance);
		builder.append(", ownGarage=");
		builder.append(ownGarage);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
