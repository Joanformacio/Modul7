package com.vehicles.project;

import java.util.Date;

public class Person {
	private String name;
	private String surname;
	private Date birthday;
	
	public Person(String name, String surname, Date birthday) throws Exception {
		
		if (name.equals("")) throw new Exception("The name can not to be empty");
		if (surname.equals("")) throw new Exception("The surname can not to be empty");
		if (birthday==null) throw new Exception("Date fo birthday can no to be Empty");
		this.name=name;
		this.surname=surname;
		this.birthday=birthday;
		
	}

	public String getName() {
		return name;
	}

	

	public String getSurname() {
		return surname;
	}

	

	public Date getBirthday() {
		return birthday;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
