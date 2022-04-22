package com.javaex.ex04;

public class Point_class {
	//필드
	private int x;
	private int y;
	
	//생성자
	//generate constructor using fields;
	public Point_class() {
	}
		
	public Point_class(int x, int y) {
		this.x = x;
		this.y = y;
	}



	//메소드 - gs
	//generate getters and setters로 생성!
	public int getX() {
		return x;
	}

	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
	
	
	
	
	
	/* 직접 생성한 getters/setters
	public void setX (int x) {
		this.x = x; //어떤 x가 어떤 x인지 헷갈리면 안됨,
	}
	public void setY (int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	*/
	
	//메소드 - 일반
	public void draw() {
		System.out.println("점[x="+ x + ", y=" + y + "]을 그렸습니다.");
	}
	
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x="+ x + ", y=" + y + "]을 그렸습니다.");
		}else {
			System.out.println("점[x="+ x + ", y=" + y + "]을 지웠습니다.");
		}
	}
	

}
