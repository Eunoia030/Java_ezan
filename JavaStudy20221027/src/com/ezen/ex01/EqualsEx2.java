package com.ezen.ex01;

class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
//	@Override
//	public boolean equals(Object obj) {
////		return super.equals(obj);
////		boolean result = id == ((Person)obj).id;
////		
////		return result;
//		
//		return id == ((Person)obj).id;
//	}
//}
	

public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(1111);
		Person p2 = new Person(1111);
		
		if(p1 == p2)
			System.out.println("p1과 p2는 같은 사람!!");
		else
			System.out.println("p1과 p2는 다른 사람!!");
		
		if(p1.equals(p2))  // p2 는 오버라이딩한 obj로  p1은  id 로
			System.out.println("p1과 p2는 같은 사람!!");
		else
			System.out.println("p1과 p2는 다른 사람!!");
	}

}
