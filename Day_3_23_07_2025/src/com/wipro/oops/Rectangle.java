package com.wipro.oops;

public class Rectangle extends Shape {
	
	double length;
	double breadth;
	
	public Rectangle(String color, String position, double length, double breadth) {
		super(color, position);
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle()
	{
		super();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", color=" + color + ", position=" + position
				+ "]";
	}
	
	
	
	
	
}
