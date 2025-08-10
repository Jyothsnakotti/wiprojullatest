package com.wipro.thread;

public class Exercise_1 {
	public static void main(String[] args) {
		
	
	Thread t1 = new Thread(() -> {
        for (int i = 1;i <= 10;i++) {
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Number: " + i);
        }
    });
    Thread t2 = new Thread(() -> {
        for (char ch ='A'; ch <='J'; ch++) {
           
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Letter: " + ch);
        }
    });

    t1.start();
    t2.start();
}
}
