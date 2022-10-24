package com.ezen.ex1;


public class CirecleEx0 {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.r = 5;
		c.p.x = 10;
		c.p.y = 20;
		System.out.println(c.p.x);
		
		Circle cir = new Circle();
		System.out.println(cir);
		
		
	}
}

class Point {
	int x;
	int y;
}

//class Circle extends point {   //상속
//int r;
//}

class Circle {   //상속하지 않고 하는 방법?
	int r;
	Point p = new Point();
}

//point 클래스는 circle 클래스에 포함된다.