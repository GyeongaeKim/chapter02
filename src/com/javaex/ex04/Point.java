package com.javaex.ex04;

public class Point {
	
	//필드
	private int xpoint;
	private int ypoint;
	
	
	//생성자
	
	
	//메소드 gs
	public void setXpoint(int x) {
		xpoint = x;
	}
	public void setYpoint(int y) {
		ypoint = y;
	}
	public int getXpoint() {
		return xpoint;
	}
	public int getYpoint() {
		return ypoint;
	}
	
	
	
	//메소드 일반
	public void draw() {
		System.out.println("점[x="+ xpoint + ", y=" + ypoint + "]을 그렸습니다.");
	}

}
