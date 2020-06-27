package com.autowiring;

public class Student {
	
	private int rollNo;
	private String name;
	private Address address;
	private Atm atm;
	
	public Student() {
		
	}
	public Student(int rollNo, String name, Address address, Atm atm) {
		  this.rollNo = rollNo;
		  this.name = name;
		  this.address = address;
		  this.atm = atm;
	}
	public Student(Address address, Atm atm) {
		 this.address = address;
		 this.atm = atm;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Atm getAtm() {
		return atm;
	}
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", atm=" + atm + "]";
	}
	
	

}
