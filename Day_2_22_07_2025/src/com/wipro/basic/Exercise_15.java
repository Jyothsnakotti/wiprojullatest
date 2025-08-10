package com.wipro.basic;

public class Exercise_15 {

	public static void main(String[] args) {
//		int[] arr = {2, 7, 11, 15};
//        int target = 9;
//        int[] output= new int[2];
//        System.out.println("Here");
//        for (int i = 0; i < arr.length; i++) {
//          
//                if (((i+1)<arr.length) && (arr[i] + arr[i+1] == target)) 
//                {
//                	System.out.println("Here");
//                	output[0]=i;
//                	output[1]=i+1;
//                    
//                }
//            
//        }
//
//        System.out.println(output[0] + output[1]);
    

		int[] arr = {2, 7, 11, 15}; 
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indices: [" + i + ", " + j + "]");
                    return;
                }
            }
        }

        System.out.println("No pair found.");

	}
}
