package com.ezen.ex06;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
//		fe.water();
//		car = fe;	
////		car.water();	//불가!!! 
//		fe2 = (FireEngine)car;
//		fe2.water();
		
		car = new Car();
		fe2 = (FireEngine)car;	//실행시 error발생!! 
		fe2.water();				// why? car = new FireEngine(); 즉, 상위클래스인 car가 FireEngine를 참조한 형태를 띤 상태에서 형변환을 실행해야한다. = 다운캐스팅 
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrrrr~");
	}
	
	void stop() {
		System.out.println("STOP!!!!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!!!!!");
	}
}