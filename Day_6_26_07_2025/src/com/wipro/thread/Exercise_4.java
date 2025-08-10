package com.wipro.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise_4 {
	public static void main(String[] args) {
        
        ExecutorService e = Executors.newFixedThreadPool(5);

      
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            e.submit(() -> {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Task " + taskId + " - Number: " + j);
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        System.out.println("Task " + taskId + " was interrupted.");
                    }
                }
            });
        }
        e.shutdown();
    }
}
