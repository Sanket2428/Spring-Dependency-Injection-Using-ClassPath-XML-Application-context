package com.sk;

public class Upi implements IPayment {
	public void processPayment(double ammount) {
		System.out.println("payment process via UPI..:"+ammount);
	}
}
