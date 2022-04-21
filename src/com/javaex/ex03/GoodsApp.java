package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		//카메라
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
				
		//컴퓨터
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		//컵
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
			
		
		//showInfo()
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		
		
		/*
		String cameraName = camera.getName();
		System.out.println(cameraName);
		int cameraPrice = camera.getPrice();
		System.out.println(cameraPrice);
		*/
		
		/*
		System.out.println("상품이름: "+ camera.getName()+", 가격: "+ camera.getPrice());
		System.out.println("상품이름: "+ computer.getName()+", 가격: "+ computer.getPrice());
		System.out.println("상품이름: "+ cup.getName()+", 가격: "+ cup.getPrice());
		*/
		
	}

}
