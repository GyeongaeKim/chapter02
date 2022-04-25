package com.javaex.ex10;

public class Goods {
	
	//필드
	private String name;
	private int price;
	public static int count; //private로 막으면 안됨..ㅠㅠ
	
	
	//생성자         --->   this.count=count+1; 추가 
	public Goods(){
		this.count=count+1;
	}
	

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		this.count = count+1;
	}


	//메소드 gs
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price+", count:"+count);
	}


	
	
	
	

}
