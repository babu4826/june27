package com.annotations;

public interface Atm {
	
	boolean validatePin(int pinNo);
	
	int balanceInquiry();
	
	int cashWithDrawal(int requestedAmount);

}
