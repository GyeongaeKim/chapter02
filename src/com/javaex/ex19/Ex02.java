package com.javaex.ex19;

public class Ex02 {

	public static void main(String[] args) {
		
		//ArrayException
		
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		
		//System.out.println(intArray[3]);
		
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally 영역");
		}
		
		
		
		//
		for(int i=0; i<=intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		
		
		

	}

}
