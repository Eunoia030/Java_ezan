package com.ezen.ex01;

public class PersonEx01 {

	public static void main(String[] args) {
		Person 홍길동 = new Person();
//		홍길동.name = "홍길동";
		홍길동.setName("홍길동");
//		홍길동.age = 150;
		홍길동.setAge(150);
		
		Student 이순신 = new Student();
//		이순신.name = "이순신";
		이순신.setName("이순신");
//		이순신.age = -50;
		이순신.setAge(-50);
	}

}

class Person {
	private String name;
	private int age;
	
	void setAge(int age) {
		if(age<0 && age>120)
			System.out.println("나이 입력 요구 확인 바람");
		else
			this.age = age;
	}
	
	
	void setName(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println("사람은 식사를 한다."+age);
	}
}

class Student extends Person {
	String major;
	String no;

	void study() {
		System.out.println("학생은 공부를 한다.");
	}
}