package com.ezen.ex07;


class Person {
	
}

class Student extends Person {	//학생
	
}
class WorkStudent extends Student {
	
}

public class PolymorphismEx01 {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Student st = new Student();
		WorkStudent ws = new WorkStudent();
		//참조변수는 자기 자신을 참조할 수 있으면, 또한 자신을 상속한 클래스는 참조가 가능하다.
		p = p;
		p = st;
		p = ws;
		
		st = st;
		st = ws;
//		st = p;	//하위클래스가 상위클래스 참조불가
		
		ws = ws;
//		ws = st;	// 같은 이유
//		ws = p;		// 같은 이유
		
		
	}
	
}