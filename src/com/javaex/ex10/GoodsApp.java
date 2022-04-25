package com.javaex.ex10;

//static 사전조사
	
public class GoodsApp {
	//필드
	//생성자
	//메소드 gs
	//메소드 일반
	
	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		System.out.println(camera.getCount());
		
		Goods computer = new Goods("LG그램", 90000);
		System.out.println(computer.toString());
		System.out.println(computer.getCount());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		System.out.println(cup.getCount());
		
		
		
		System.out.println(Goods.count);
		

	}

}
