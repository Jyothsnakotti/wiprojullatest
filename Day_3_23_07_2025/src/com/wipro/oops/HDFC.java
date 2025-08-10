package com.wipro.oops;

public class HDFC implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		System.out.println("HDFC: Deposited " + amount + " into " + accNumber);
	}

	@Override
	public double withdraw(double amount, String accNumber) {
		System.out.println("HDFC: Withdrew " + amount + " from " + accNumber);
		return 0;
	}

}
