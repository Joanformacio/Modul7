package com.vehicles.project;

import java.util.Date;

public class OwnerDriver extends Person{
	
	License license;
	public OwnerDriver(String name, String surname, Date birthday, License license) throws Exception{
		super(name, surname, birthday);
		if (license==null) throw new Exception("The License can not to be empty");
		this.license=license;
	}
}
