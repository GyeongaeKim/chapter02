package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point first = new Point();
		first.setXpoint(5);
		first.setYpoint(5);
		
		Point second = new Point();
		second.setXpoint(10);
		second.setYpoint(23);
		
		
		first.draw();
		second.draw();
		
	}

}
