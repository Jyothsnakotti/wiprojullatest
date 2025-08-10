package com.wipro.oops.test;

import com.wipro.oops.Citi;
import com.wipro.oops.HDFC;

public class BankTest {

	public static void main(String[] args) {
		  HDFC hdfc = new HDFC();
	        Citi citi = new Citi();

	        System.out.println("HDFC Transactions ---");
	        hdfc.deposit(1000, "HDFC218929");
	       
	        System.out.println("Citi Transactions ---");
	        citi.deposit(500, "CITI00291829");
	     
	}

}
