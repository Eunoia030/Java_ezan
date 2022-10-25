package com.ezen.ex06;


class Person {
	private String name;
	private int age;	//private	같은 클래스내에서만 가능하도록 제어
	void eat() {
		System.out.println("사람은 식사를 한다.");
	}
}

class Student extends Person {	//학생
	void study() {
		System.out.println("공부를 한다.");
	}
}
class WorkStudent extends Student {
	void work() {
		System.out.println("일을 한다.");
	}
}

public class PolymorphismEx01 {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p = new Student();
//		p = new WorkStudent();
		
		System.out.println("-------------------");
		Student s = new Student();
		
		s = new WorkStudent();
//		s = new Person(); >>하위클래스가 상위클래스 참조불가
		
//		s=p;	-> 이대로는 불가능하다. p는 student클래스를 참조한 상태라 할지라도 내용물은 person 그대로인 상위클래스이기 때문에 참조한 다른 변수들은 접근할수가 없다. 하위클래스가 상위클래스를 참조하려면 형변환이 필요하다.
		s = (Student)p;	// 참조한 상태의 p를 형변환하여 하위 클래스인 Student가 참조 할수있게 할수 있다.///복구?

		s.study();
		s.eat();
		
		
		WorkStudent ws = new WorkStudent();
//		ws = new Student();	//상위클래스
//		ws = new Person();	//상위클래스
		
	}
	
}