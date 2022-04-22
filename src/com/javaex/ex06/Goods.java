package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() { //기본생성자
		//***** 생성자는 메모리에 올리는 일을 한다!!! *****
		//생성자없이는 클래스로부터 객체를 만들 수 없다(클래스를 인스턴스화)
		//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다
		//필요시 로직 추가++
		//생성자가 한 개라도 있으면 기본 생성자 추가 x 
	}
	
	public Goods(String name) {
		//추가로직
		this.name = name;
		System.out.println("Goods(1)");
	}
	
	public Goods(int price) {
		//추가로직
		this.price = price;
	}
	
	
	public Goods(String name, int price) {
		//추가 로직
		this.name = name;
		this.price = price;
		//System.out.println("Goods(2)");
	}
	
	
	
	
	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	//메소드 일반 -> html(2일)
	public void showInfo() {
		System.out.println("상품이름: " + this.name);
		System.out.println("가격: " + this.price);
		System.out.println("");
	}
	
	
	
	
	//임시로 빠르게 산출하고 싶을때는 이렇게 산출해 볼 수 있다.
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
