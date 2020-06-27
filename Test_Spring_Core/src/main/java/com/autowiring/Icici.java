package com.autowiring;

public class Icici implements Atm {

	public boolean validatePin(int pinNo) {
		System.out.println("This is validatePin method of Icici java class");
		return false;
	}

	public int balanceInquiry() {
		System.out.println("This is balanceInquiry method of Icici java class");
		return 0;
	}

	@Override
	public String toString() {
		return "Icici []";
	}
	
	

}
