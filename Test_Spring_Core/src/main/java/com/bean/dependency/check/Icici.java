package com.bean.dependency.check;

public class Icici {
	
	public boolean validatePin(int pinNo){
		System.out.println("This is validatePin method of Icici java class");
		return true;
	}
	
	public int balanceInquiry(){
		System.out.println("This is balanceInquiry method of Icici java class");
		return 5000;
	}

	@Override
	public String toString() {
		return "Icici []";
	}
	
	

}
