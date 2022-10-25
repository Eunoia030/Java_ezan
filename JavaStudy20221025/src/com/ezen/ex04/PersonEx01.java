package com.ezen.ex04;

public class PersonEx01 {

	public static void main(String[] args) {
		
		Person 황규성 = new Person("황규성");
		Student 최연정 = new Student();
		
	Tests 이우승 = new Tests();
	이우승.eat();
	}

}
abstract class AbstractTest{  	//추상 클래스 -> 미완성설계도 
	int age;
	String name;
	abstract void eat(); //추상메소드 abstract -> 바디가 없다.
}

class Tests extends AbstractTest {
	int height=100;
	
	@Override
	void eat() {
		System.out.println("먹고 논다..");
	}
	
}



class Person {
	String name;
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	void eat() {
		System.out.println("사람은 식사를 한다.");
	}
}

class Student extends Person {
	String major;
	String no;
	
	Student(String major){
		super("백수민");
		this.major = major;
	}
	
	
	public Student() {
		super("백수민");
	}
	
	void study() {
		System.out.println("학생은 공부를 한다.");
	}
}

class WorkStudent extends Student{
}