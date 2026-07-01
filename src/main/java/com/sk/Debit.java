package com.sk;

public class Debit implements IPayment {
	public void processPayment(double ammount) {
		System.out.println("payment process via Debit..:"+ammount);
	}
}
