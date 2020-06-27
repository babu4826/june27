package com.containers;

public class Address {
	
	private int doorNo;
	private String streetName;
	private String city;
	private int pinCode;
	String course;
	
	public Address() {
		 System.out.println("This is default constructor method of Address java class");
	}
	public Address(int doorNo, String streetName, String city, int pinCode) {
		System.out.println("This is parameterised constructor method of Address java class");
		  this.doorNo = doorNo;
		  this.streetName = streetName;
		  this.city = city;
		  this.pinCode = pinCode;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		System.out.println("This is setter method for doorNo property in Address class");
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		System.out.println("This is setter method for streetName property in Address class");
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("This is setter method for city property in Address class");
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		System.out.println("This is setter method for pinCode property in Address class");
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}

}
