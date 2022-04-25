package com.javaex.ex11;

public class MathApp {

	public static void main(String[] args) {
		
		/*
		Math math = new Math();
		System.out.println(math.plus(3, 2));
		*/
		
		//static메소드로 인해, 이미 메모리에 올라가있기 때문에!!
		//Math math = new Math(); 는 필요없음
		//코드의 대소문자 변화 주의** : math/Math
		System.out.println(Math.plus(3, 2));
		System.out.println(Math.plus(3.5, 2.2));
		System.out.println(Math.circleArea(5));

	}

}
