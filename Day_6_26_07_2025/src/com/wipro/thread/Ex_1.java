package com.wipro.thread;

public class Ex_1 extends Thread{
	public static void main(String[] args) {
		NumThread n1=new NumThread();
		AlphaThread t1=new AlphaThread();
		t1.run();
		n1.run();
	}
}
