package com.tts;

import java.util.Calendar;

public class Person {

	// Constant Variables
	static final Integer MINIMUM_AGE = 0;

	// Instance Variables

	private String name;
	private Integer age;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if (age < MINIMUM_AGE) {
			this.age = MINIMUM_AGE;
		} else {
			this.age = age;
		}
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Person() {
		this.name = "Test User";
		setAge(MINIMUM_AGE);
		this.location = "New York City, NY";
	}

	public Person(String name) {
		this.name = name;
		setAge(MINIMUM_AGE);
		this.location = "New York City, NY";
	}

	public Person(String name, Integer age, String location) {
		this.name = name;
		setAge(age);
		this.location = location;
	}
	
	
	public void sayHello(String friend) {
		if(friend.equals("")) {
			friend = "friend";
		}
		System.out.printf("Hello, %s! My name is %s!\n", friend, this.name);
	}
	
	public int getAgeAtNextBirthday() {
		return this.age + 1;
	}
	
	public int getCalculatdeBirthYear(Integer currentAge) {
		Calendar calendar = Calendar.getInstance();
		Integer currentYear = calendar.get(Calendar.YEAR);
			return currentYear - currentAge;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", location=" + location + "]";
	}

}
