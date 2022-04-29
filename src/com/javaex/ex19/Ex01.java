package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double result;
		int num;
		
		
		num = sc.nextInt();
		
		
		
		//예외처리 try-catch문     try쓰고 ctrl + space bar
		try {
			//예외가 발생할 가능성이 있는 실행문
			result = 100/num;
			
			System.out.println(result);
			
		}catch(ArithmeticException e/*처리할 예외타입 선언*/) {
			//예외 발생시,,
			System.out.println("0으로 나눌 수 없습니다.");	
		}finally {
			//예외 발생 여부와 상관없이 무조건 실행되는 문장(생략가능)
			System.out.println("finally영역");
		}
		
		
		
		
		
		sc.close();
		
		
		

	}

}
