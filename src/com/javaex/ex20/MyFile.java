package com.javaex.ex20;

import java.io.IOException;

public class MyFile {
	
	//필드
	//생성자
	public MyFile() {}
	
	
	//메소드 gs
	
	//메소드 일반
	//1.정상적인 경우
	public String read(String path) {
		//path에 있는 파일을 읽어서 문자열 만들어준다
		String result = "학교종이 땡땡땡 어서 모이자";
		return result;
	}
	
	//2.파일이 없는 경우 --- 만드는 쪽에서 예외처리하는 경우, 
	public String read2(String path) {
		String result = "";
		try {
			//path에 있는 파일을 읽어서 문자열 만들어준다
			//파일이 없을때(파일이 없는 상황을 강제로 발생)
			throw new IOException(); //IOException -입출력 동작 실패, *인터럽트 발생할 경우
		
		} catch (Exception e) {                       //Exception--->모든 예외를 한꺼번에 처리하고 싶을 때,
			System.out.println(path + " no file");
		} /*catch (IOException e) {
			System.out.println(path + " no file");
		} catch (NullPointerException e) {                       --->catch는 여러개 추가 가능
			System.out.println("NullPoint");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}*/
		return result;
	}
	
	//3.파일이 없는 경우 --- 사용하는 쪽에서 예외를 알리는 경우,
	public void read3(String path) throws IOException{
		String result = "";
		throw new IOException(); 
	}
	
}
