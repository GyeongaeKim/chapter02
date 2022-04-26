package com.javaex.ex12;

public class Person {
	
	//필드
	public String name;
	public int age;
	
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	
	//
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	//
	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
	
		
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
