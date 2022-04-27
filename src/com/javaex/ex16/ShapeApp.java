package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		//1
		Shape s = new Shape("빨강", "노랑");
		//2
		Rectangle r = new Rectangle("빨강", "검정", 5, 5);
		//3
		//메모리에는 다 올라가고 부모쪽만 보임
		Shape sr = new Rectangle("빨강", "검정", 15, 15);
		//System.out.println(sr01.getWidth()); <--- 자식의 메소드를 사용할 수 없다.
		
		
		
		
		
		//Shape 배열(하나의 배열)에 모든 도형을 담아서 관리하고 싶으면...
		
		//Shape 배열 생성
		Shape[] sArray = new Shape[6];
		
		//1. 사각형 2개
		Shape r01 = new Rectangle("빨강", "검정", 4, 4);
		Shape r02 = new Rectangle("주황", "검정", 5, 5);
		
		//2. 원 2개
		Shape c01 = new Circle("노랑", "검정", 6);
		Shape c02 = new Circle("초록", "검정", 7);
		
		//3. 삼각형 2개
		Shape t01 = new Triangle("파랑", "검정", 4, 4);
		Shape t02 = new Triangle("남색", "검정", 9, 9);
		
		
		//배열에 도형담기 -> 도형마다 배열을 만들 필요 없이, 하나의 배열에만 담으면 됨!
		sArray[0]=r01;
		sArray[1]=r02;
		sArray[2]=c01;
		sArray[3]=c02;
		sArray[4]=t01;
		sArray[5]=t02;
		
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].toString());
		}
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		
		
		//자식클래스로 형변환(명시적으로 타입변환)! "(다운)캐스팅"
		((Rectangle)sArray[0]).getWidth();
		System.out.println(((Rectangle)sArray[0]).getWidth());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
