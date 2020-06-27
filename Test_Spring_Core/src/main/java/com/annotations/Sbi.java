package com.annotations;

import org.springframework.stereotype.Component;

@Component   //Sbi sbi = new Sbi()
public class Sbi implements Atm {

	public boolean validatePin(int pinNo) {

		System.out.println("this is validatePin method of Sbi java class");
		return false;
	}

	public int balanceInquiry() {

		System.out.println("this is balanceInquiry method of Sbi java class");
		return 0;
	}

	public int cashWithDrawal(int requestedAmount) {

		System.out.println(" this is cashWithdrawal method of Sbi java class ");
		return 0;
	}

}
