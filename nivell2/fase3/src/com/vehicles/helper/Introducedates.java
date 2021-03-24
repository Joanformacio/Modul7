package com.vehicles.helper;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Introducedates {

	public static  Date CreateDates(int year, int month, int day) throws Exception {
		
		if ( year<0) throw new Exception("Ther field year is null");
		if ( month<0) throw new Exception("Ther field month is null");
		if ( day<0) throw new Exception("Ther field day is null");
		
		Calendar miCalendar= new GregorianCalendar(year, month, day);
		Date newDate = miCalendar.getTime();
		
		return newDate;
	}

}
