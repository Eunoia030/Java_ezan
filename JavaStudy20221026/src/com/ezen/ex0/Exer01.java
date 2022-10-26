package com.ezen.ex0;

class Student extends Person{
	String major;
	String no;
	void study() {
		System.out.println("공부한다.");
	}
}
class Person{
	String name; //private  = 접근 no!
	String age;
	static int leg = 2;	//final = 수정 불가! 
//	void eat() {
//		System.out.println("먹는다");
//	}
	void study() {}	//오버라이딩
	static void eat() {
		System.out.println("먹는다");
	}
}

public class Exer01 {
	
	public static void main(String[] args) {
		//p 참조변수는 Student 안 study 메소드 접근 불가
		Person p = new Student();
		p.study();	//그러나 조상클래스인 person에 study메소드를 붙여 사용하면 접근이 가능하다(내용이 달라도 상관없다. = 출력시, 하위 클래스로 출력) 
		
		Person p2 = new Person();
		Student s1 =(Student) p;	//s1이 전부 접근 가능 = 제약이 사라짐
		
		s1 = (Student)p2;//************중요!!! 오류오류!! 접근이 가능하려면 참조한 형태의 상위클래스가 다운캐스팅을 해야 가능하다.
		
//		Student p = new Student();
		
//		p.name = 4;		// error why? 	객체가 생성되지 않았기 때문이다. 쓰려면?
//		System.out.println(Person.leg);
//		
//		Person.eat();
//		
//		Person p = new Person();
//		p.name = "홍길동";
//		System.out.println(p.name);
//		p.leg=10;
//		System.out.println(p.leg);
	}
	
}