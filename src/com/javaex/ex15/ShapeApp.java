package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("빨강", "노랑");
		System.out.println(s01);   //굳이 s01.toString() 으로 표기할 필요 없다
		//s01.draw();
		
		
		Rectangle r01 = new Rectangle("빨강", "검정", 4, 6);
		Rectangle r02 = new Rectangle("파랑", "검정", 7, 7);
		System.out.println(r01.toString());
		r01.draw();
		r02.draw();
		
		
		Circle c01 = new Circle("빨강", "검정", 5);
		Circle c02 = new Circle("파랑", "검정", 10);
		
		
		Triangle t01 = new Triangle("빨강", "노랑", 30, 10);
		Triangle t02 = new Triangle("파랑", "검정", 10, 10);
		
		
		System.out.println("======================================");
		//배열
		Rectangle[] rArray = new Rectangle[2];
		rArray[0]=r01;
		rArray[1]=r02;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		
		Circle[] cArray = new Circle[2];
		cArray[0]=c01;
		cArray[1]=c02;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		Triangle[] tArray = new Triangle[2];
		tArray[0]=t01;
		tArray[1]=t02;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		
		
		
		

	}

}
