package com.wipro.basic;

//Remove duplicates from a sorted array and return the length of the resulting array.
//Input: A sorted integer array arr.
//Output: Length of the array after removing duplicates.
//Example:
//Input: [1, 1, 2, 2, 3, 4, 4, 5]
//Output: 5 (resulting array: [1, 2, 3, 4, 5])
// in java



public class Excercise_14 {

	public static void main(String[] args) {
	
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Length after removing duplicates: " + (j + 1));

	}
}


