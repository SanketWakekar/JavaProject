package com.example.sanket;

public class Student {

	private String name;
	private String city;
	
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
}
