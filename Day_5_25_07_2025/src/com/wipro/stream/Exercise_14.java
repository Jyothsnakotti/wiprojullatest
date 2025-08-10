package com.wipro.stream;

import java.util.Arrays;
import java.util.List;

public class Exercise_14 {
	
	 public static void main(String[] args) {
    
       FoodItem f1=new FoodItem("Veg Noodles", "Veg", "Chinese", 150);
       FoodItem f2= new FoodItem("Chicken Manchurian", "Non Veg", "Chinese", 200);
       FoodItem f3=new FoodItem("Green Curry", "Veg", "Thai", 250);
       FoodItem f4=new FoodItem("Pasta", "Veg", "Continental", 180);
    	
       List<FoodItem> s1= Arrays.asList(f1,f2,f3,f4);
       FoodItem l1=s1.stream()
    		.filter(f -> f.getCuisine(). equals("Chinese"))
    		.reduce((a1,a2)->a1.getPrice()>a2.getPrice()?a1:a2)
    		.orElse(null);
    System.out.println(l1);
   


        }
 }

