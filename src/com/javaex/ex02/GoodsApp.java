package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		Goods laptop = new Goods();
		laptop.name = "LG그램";
		laptop.price = 900000;
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println("상품이름: "+camera.name+",  "+"가격: "+camera.price);
		System.out.println("상품이름: "+laptop.name+",  "+"가격: "+laptop.price);
		System.out.println("상품이름: "+cup.name+",  "+"가격: "+cup.price);
		
		
		
		
		
		
		
		
		
		
	}

}
