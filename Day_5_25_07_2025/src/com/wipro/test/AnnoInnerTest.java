package com.wipro.test;

import com.wipro.annonymous.BankOps;

public class AnnoInnerTest {

	public static void main(String[] args) {
		
		BankOps savingsAccount = new BankOps() {
            @Override
            public void deposit(double amount) {
                System.out.println("Depositing " + amount + " into Savings Account");

            }
		};
		
		BankOps currentAccount = new BankOps() {
            @Override
            public void deposit(double amount) {
                System.out.println("Depositing " + amount + " into Current Account");
            }
        };
        savingsAccount.deposit(200000);
        currentAccount.deposit(10000);
	}
		
	}
