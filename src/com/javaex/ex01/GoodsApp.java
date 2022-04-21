package com.javaex.ex01;

public class GoodsApp {
	
	//메모리를 움직여주는 애들은 메인이 필요하다.
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		
		
	}

}
