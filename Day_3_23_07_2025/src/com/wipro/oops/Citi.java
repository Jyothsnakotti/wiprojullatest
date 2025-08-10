package com.wipro.oops;

public class Citi implements BankOps {


	@Override
	public void deposit(double amount, String accNumber) {
		 System.out.println("Citi: Deposited " + amount + " into " + accNumber);

	}

	@Override
	public double withdraw(double amount, String accNumber) {
		 System.out.println("Citi: Withdrew " + amount + " from " + accNumber);
		return 0;
        
	}

}
