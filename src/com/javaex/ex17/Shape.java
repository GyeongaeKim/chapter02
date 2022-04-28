package com.javaex.ex17;

public abstract class Shape {
	//abstract->추상화 선언

	// 필드
	protected String fillColor;
	protected String lineColor;

	
	// 생성자
	public Shape() {
		System.out.println("Shape()");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape(2)");
	}

	
	// 메소드 gs
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
	// 메소드
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	//해당 메소드는 내용이 필요없기 때문에, 추상화해준다.
	//이 메소들은 자식클래스에도 꼭 있어야 함!!
	public abstract void draw();
	public abstract double area();
	
	
	
	
	

}
