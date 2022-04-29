package com.javaex.ex20;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		
		 MyFile mf = new MyFile();
		 
		//String str = mf.read("MyFile.txt");
		//System.out.println(str);
		 
		 
		//String str = mf.read2("MyFile.txt");
		//System.out.println(str);
		
		 
		//mf.read3("MyFile.txt"); //MyFile.java 에서 throws처리했기때문에, 오류표시가 뜨는거임
		//여기서 오류가 뜨기때문에, 여기에다가 직접 try-catch문을 사용하여 예외 해결;
		try {
			mf.read3("MyFile.txt");
		} catch (IOException e) {
			System.out.println("*************************");
			System.out.println("*****파일이 없습니다*****");
			System.out.println("*************************");
		}
	
		 

	}

}
