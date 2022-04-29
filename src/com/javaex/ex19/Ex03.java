package com.javaex.ex19;

public class Ex03 {

	public static void main(String[] args) {

		//NullPointException
		
		String str = new String("안녕하세요");
		str = null;
		
		
		//System.out.println(str.toString());
		
		
		try {
			System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
		}

	}

}
