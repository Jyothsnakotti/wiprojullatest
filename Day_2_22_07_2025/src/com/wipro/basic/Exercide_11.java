package com.wipro.basic;

public class Exercide_11 {
	public static void main(String[] args) {
//		int a[] = {1,2,3,45};
//		System.out.println(a[0]);
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
	
	
		int[] numbers = {3, 7, 1, 9, 4};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println("Doubled values in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
	}
}
