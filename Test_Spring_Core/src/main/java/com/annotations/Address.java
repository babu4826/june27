package com.annotations;

import org.springframework.stereotype.Component;

//@Component   // Address address = new Address();
@Component(value="adrObj")  // Address adrObj = new Address();
public class Address {
	
	private int doorNo;
	private String streetName;
	private String city;
	
	public Address() {
		
	}
	public Address(int doorNo, String streetName, String city) {
		   this.doorNo = doorNo;
		   this.streetName = streetName;
		   this.city = city;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + "]";
	}
	
}
