package com.bean.dependency.check;

public class Student {
	
	private int rollNo;
	private String name;
	private char gender;
	private Address address;
	private Icici iciciObj;
	
	public Student() {
		
	}
	public Student(int rollNo, String name, char gender, Address address, Icici icici) {
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.iciciObj = icici;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Icici getIciciObj() {
		return iciciObj;
	}
	public void setIciciObj(Icici iciciObj) {
		this.iciciObj = iciciObj;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ ", iciciObj=" + iciciObj + "]";
	}
	
}
