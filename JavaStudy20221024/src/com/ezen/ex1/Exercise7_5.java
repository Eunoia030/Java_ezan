package com.ezen.ex1;


public class Exercise7_5 {

	public static void main(String[] args) {
	
		Tv t = new Tv();
		System.out.println(t.price);
		System.out.println(t.bonusPoint);
		
	}
}


//class Product {
//	int price; // 제품의 가격
//	int bonusPoint; //제품구매시 제공하는 보너스 점수
//	
//	public Product() {}
//	
//	public Product (int price){
//		this.price = price;
//		bonusPoint = (int)(price/10.0);
//	}
//}
//
//	class Tv extends Product {
//		Tv() {
//		}
//	
//	public String ToString() {
//		return "Tv";
//	}
//}



class Product {
	int price; // 제품의 가격
	int bonusPoint; //제품구매시 제공하는 보너스 점수
	
	Product (int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(10000);
	}
		
	public String ToString() {
		return "Tv";
	}
}


