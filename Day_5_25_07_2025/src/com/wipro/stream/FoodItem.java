package com.wipro.stream;

public class FoodItem {
	 private String name;
	    private String type;
	    private String cuisine;
	    private int price;

	    public FoodItem(String name, String type, String cuisine, int price) {
	        this.name = name;
	        this.type = type;
	        this.cuisine = cuisine;
	        this.price = price;
	    }	   
	    public String getName() 
	    { 
	    	return name; }
	    public String getType() 
	    { 
	    	return type; }
	    public String getCuisine()
	    { 
	    	return cuisine; }
	    public int getPrice() 
	    { 
	    	return price; }

	   
	    @Override
	    public String toString() {
	        return name + " / " + type + "/ " + cuisine + " / Rs." + price;
	    }
}
