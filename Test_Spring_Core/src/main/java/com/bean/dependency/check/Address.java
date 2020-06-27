package com.bean.dependency.check;

public class Address {
	
	private int doorNo;
	private String streetName;
	private String city;
	private int pinCode;
	
	public Address() {
		
	}
	public Address(int doorNo, String streetName, String city, int pinCode) {
		  this.doorNo = doorNo;
		  this.streetName = streetName;
		  this.city = city;
		  this.pinCode = pinCode;
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
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}
	

}
