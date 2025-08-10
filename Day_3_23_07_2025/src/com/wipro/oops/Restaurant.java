package com.wipro.oops;

public class Restaurant {
	 String name;
	 String location;
	 int rating;
	
	 public Restaurant(String name, String location, int rating) {
		this.name = name;
        this.location = location;
        this.rating = rating;
        }
		
		    public String getName() {
		        return name;
		    }

		    public String getLocation() {
		        return location;
		    }

		    public int getRating() {
		        return rating;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public void setLocation(String location) {
		        this.location = location;
		    }

		    public void setRating(int rating) {
		        this.rating = rating;
		    }

		    @Override
		    public String toString() {
		        return "Restaurant [Name=" + name + ", Location=" + location + ", Rating=" + rating + "]";
		    }
	
	
}

