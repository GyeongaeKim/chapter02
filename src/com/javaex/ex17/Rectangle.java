package com.javaex.ex17;

public class Rectangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	public Rectangle() {
		super();
		System.out.println("Rectangle()");
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(4)");
	}

	
	//메소드 gs
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	

	
	//메소드 일반
	/*
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	*/
	
	/*
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	*/
	
	@Override
	public String toString() {
		//부모가 필드를 protected로 설정했기때문에,
		//부모의 생성자를 그냥 가져올 수 있다.
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + ", 가로:" + width + ", 세로:" + height + " 사각형을 그렸습니다.]");
	}
	
	
	public double area() {
		double area = width * height;
		System.out.print("사각형 넓이: ");
		return area;
	}
	
	
	
	

}
