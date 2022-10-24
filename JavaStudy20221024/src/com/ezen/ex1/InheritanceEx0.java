package com.ezen.ex1;

public class InheritanceEx0 {

	public static void main(String[] args) {
		
//		Person P = new Person();   //생성자가 없을시 에러
		
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		
		SportsMan sp = new SportsMan();
		System.out.println(sp.name);
		System.out.println(sp.age);
			
	}

}
//사람 
class Person {
	String name;
	int age;
	
//	Person(){
//		
//	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	void sleep() {
		System.out.println("잠을 잔다...");
	}

	void eat() {
		System.out.println("먹는다...");
	}
	
	void study() {
		System.out.println("공부한다..");
	}
	
}

//학생 중에 학내에서 일하는 근로학생
class WorkStudentP{
	String name;
	int age;
	String major;
	String no;
	String job;//일하는 종류
	
	void sleep() {
		System.out.println("잠을 잔다...");
	}

	void eat() {
		System.out.println("먹는다...");
	}
	
	void study() {
		System.out.println("공부한다..");
	}
	
	void work() {
		System.out.println("공부한다..");
	}
}



//사람들 중에 학생
class Student extends Person {

	String major; //전공
	String no; //학번
	
	public Student() {
//		super(); //
		super("홍길동",30);    // super() 
	}
	
}

class SportsMan extends Person{
	String sports; //운동 종목
	
	public SportsMan() {
		super("구구가가",25);
	}
	
	void 운동한다() {
		System.out.println("운동한다..");
	}
}
