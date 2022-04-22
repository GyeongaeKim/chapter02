package com.javaex.ex04;

public class PointApp_class {
	
	public static void main(String[] args) {
		
		Point_class p1 = new Point_class();
		p1.setX(5);
		p1.setY(5);
		
		Point_class p2 = new Point_class();
		p2.setX(10);
		p2.setY(23);
		
		
		Point_class p3 = new Point_class(10, 20);
		
		//Point_class p4 = new Point_class(5, 5);

		
		//y값을 먼저 넣고
		//setter x 값을 넣는다
		//Point_class p5 = new Point_class(200); //y값
		//p5.setX(11);
		
		p1.draw();
		p2.draw();
		p3.draw();
		//p4.draw();
		//p5.draw();
		
		
		p3.draw(true); //그리기
		p3.draw(false); //지우기
		
		
	}

}
