package com.vehicles.view;

import java.util.Date;
import java.util.Calendar;

import java.util.GregorianCalendar;

import com.vehicles.helper.*;
import com.vehicles.project.*;

public  class Managedriver {
	TypeLicense categoryLicense;
	public static OwnerDriver CreateOwnDriver() throws Exception {
		Date birthdayDriver = Introducedates.CreateDates(1978, 01, 25);
		Date dateOptineLicense = Introducedates.CreateDates(1995, 03, 26);
		
		License license= new License( TypeLicense.B, dateOptineLicense, true, false);
		OwnerDriver ownDriver= new OwnerDriver( "Joan",  "Luis",  birthdayDriver,  license);
		
		return ownDriver;
	}
	
	
}
