package com.javaex.ex18;

public class Circle extends Shape implements Drawable{
	
	//필드
	private int radius;
	
	
	//생성자
	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

	
	
	//메소드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + ", 반지름:" + radius + " 원을 그렸습니다.]");
	}
	
	public double area() {
		double area = 3.14 * radius * radius;
		System.out.print("원 넓이: ");
		return area;
	}
	

}
