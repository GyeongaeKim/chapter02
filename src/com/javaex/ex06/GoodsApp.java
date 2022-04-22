package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		//생성자의 추가 로직이용
		Goods computer = new Goods("LG그램", 900000);
		Goods camera = new Goods("니콘");
		Goods cup = new Goods(2000);
		
		
		//Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
	
		
		//Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		
		//Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		
		computer.showInfo();
		camera.showInfo();
		cup.showInfo();
		
		
		
		
		
		//toString 자체로 출력은 안되고, system.out.print로 출력할 수 있다.
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		
		
		
		//메소드 일반대신 직접 산출할 때~
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
	}

}
