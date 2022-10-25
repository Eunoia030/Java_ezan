package com.ezen.ex05;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		Person p = new Person(); //상위클래스는 자신뿐만아니라 하위클래스들을 참조할수 있다.
		p.work();
		p = new OfficeJob();	
		p.work();
		
		p = new Student();
		p.work();
		
		p = new SportsMan();
		p.work();
		p.run(); 
	}

}

class Person {
	String name;
	int age;
	void work() {
		System.out.println("사람은 일을 한다.");
	}
	void run() {
	}
}

class Student extends Person {	//학생
	void work() {
		System.out.println("공부를 한다."); //오버라이딩
	}
}

class SportsMan extends Person {	//운동선수
	void work() {
		System.out.println("운동을 한다.");	//오버라이딩
	}
	void run() {
		System.out.println("운동선수는 달린다.");
	}
}

class OfficeJob extends Person {	//사무직
	void work() {
		System.out.println("사무실에서 일을 한다.");	//오버라이딩
	}
}

class Worker extends Person {	//노동자
	void work() {
		System.out.println("현장에서 일을 한다.");	//오버라이딩
	}
}