package com.autowiring;

public class Address {
	
	private int doorNo;
	private String streetName;
	
	public Address() {
		
	}
	public Address(int doorNo, String streetName) {
		this.doorNo = doorNo;
		this.streetName = streetName;
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
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + "]";
	}
	

}
