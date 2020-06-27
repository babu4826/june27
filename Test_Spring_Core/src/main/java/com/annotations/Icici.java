package com.annotations;

import org.springframework.stereotype.Component;

@Component   // Icici icici = new Icici();
public class Icici implements Atm {

	public boolean validatePin(int pinNo) {

		System.out.println("This is validatePin method of Icici java class");
		return false;
	}

	public int balanceInquiry() {

		System.out.println("This is balanceInquiry method of Icici java class");
		return 0;
	}

	public int cashWithDrawal(int requestedAmount) {
		
		System.out.println("This is cashWithDrawal method of Icici java class");
		return 0;
	}

}
