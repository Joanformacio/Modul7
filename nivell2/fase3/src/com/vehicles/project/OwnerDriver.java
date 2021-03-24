package com.vehicles.project;

import java.util.Date;

public class OwnerDriver extends Person{
	
	License license;
	public OwnerDriver(String name, String surname, Date birthday, License license) throws Exception{
		super(name, surname, birthday);
		if (license==null) throw new Exception("The License can not to be empty");
		this.license=license;
	}
	public License getLicense() {
		return license;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OwnerDriver [license=");
		builder.append(license.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
