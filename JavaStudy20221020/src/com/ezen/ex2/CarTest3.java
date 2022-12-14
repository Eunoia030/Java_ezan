package com.ezen.ex2;

class Car00 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car00() {
		this("white", "auto", 4);
	}

	Car00(String color) {
		this(color, "auto", 4);
	}
	Car00(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		Car00 c1 = new Car00();	
		Car00 c2 = c1;
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		c1.color = "blue";
		c2.color = "red";
		System.out.println("---------------------------------------------------------");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	
	}
}
