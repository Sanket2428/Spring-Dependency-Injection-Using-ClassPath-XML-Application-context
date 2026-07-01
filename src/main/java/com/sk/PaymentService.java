package com.sk;

public class PaymentService {
	IPayment payment;
	public PaymentService() {
		
	}
	

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}


	public PaymentService(IPayment payment) {
		super();
		this.payment = payment;
	}


	public void doPayment(double ammount) {
		payment.processPayment(ammount);
		System.out.println("Payment success of : "+ammount);
	}
}
