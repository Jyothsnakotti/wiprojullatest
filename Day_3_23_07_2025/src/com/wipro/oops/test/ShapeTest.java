package com.wipro.oops.test;

import com.wipro.oops.Circle;
import com.wipro.oops.Rectangle;
import com.wipro.oops.Square;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle("blue","Top",7);
		System.out.println(circle);
        Rectangle rectangle = new Rectangle("red","Bottom",6, 0);
        System.out.println(rectangle);
        Square square = new Square("yellow","midddle",2);
        System.out.println(square);

     
	}

}
