package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Point p01 = new Point(3, 5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(100, 100);
		p02.draw();
		//p02.getX();
		
		
		System.out.println("----------------------------");
		Rectangle r00 = new Rectangle("빨강", "검정", 1, 1);
		r00.draw();
		r00.area();
		
		Shape r01 = new Rectangle("빨강", "검정", 5, 5);
		r01.area();
		//r01.draw(); Shape으로는 draw를 넣을 수 없다...ㅠㅠ
		
		Drawable r02 = new Rectangle("빨강", "검정", 10, 10);
		//r02.area();   Drawable로는 area를 넣을 수 없다...ㅠㅠ
		r02.draw();
		
		*/
		
		
		
		
		//배열선언
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Rectangle("빨강", "검정", 1, 1);
		Drawable c01 = new Circle("파랑", "검정", 3);
		Drawable t01 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8, 8);
		
		dArray[0]=r01;
		dArray[1]=c01;
		dArray[2]=t01;
		dArray[3]=p01;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		
		//사각형의 가로값
		System.out.println("사각형의 가로: " + ((Rectangle)dArray[0]).getWidth());
		
		//사각형의 면의 색
		System.out.println("사각형의 면의 색: " + ((Shape)dArray[0]).getFillColor());
		
		
		//배열통해 면적 구하기
		System.out.println("===========================================");
		System.out.println("배열통해 면적 구하기");
		
		/*
		for(int i=0; i<dArray.length; i++) {
			double area = ((Shape)dArray[i]).area();
			System.out.println(area);
			//Point는 면적을 구할 수 없기 때문에 에러가 난다!
		}
		*/
		
		for(int i=0; i<dArray.length; i++) {
			//*** instanceof *** 
			//배열의 아이들이 Shape의 형태로 변환가능한지 확인해보자
			System.out.println((dArray[i]) instanceof Shape);
			System.out.println((dArray[i]) instanceof Drawable);
		}
		
		
		//instanceof를 이용해서 에러나는 것만 빼고 결과내기~
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
		
		
		
	}
}
