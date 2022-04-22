package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	
	//생성자
	
	
	
	//메소드 - gs
	//generate getters and setters로 생성한 g/s!!
	//생성 후, 위치 재조정 잘하기!!
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


	
	
	
	
	/* 내가 직접 작성한 getters/setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		if(price<0) {
			this.price = 0;  //상품가격이 마이너스일 경우->이런식으로 설정해줄수도 있지~
		}else {
			this.price = price;
		}
		
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	*/
	
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: " + this.name);
		System.out.println("가격: " + this.price);
		System.out.println("");
	}


}











