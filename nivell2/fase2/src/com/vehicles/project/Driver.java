package com.vehicles.project;

import java.util.Date;

public class Driver extends Person{
	License license;
	public Driver(String name, String surname, Date birthday, License license) throws Exception {
		super(name, surname, birthday);
		if (license==null) throw new Exception("The License can not to be empty");
		this.license=license;
	}

}
