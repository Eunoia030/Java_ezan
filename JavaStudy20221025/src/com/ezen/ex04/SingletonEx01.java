package com.ezen.ex04;

public class SingletonEx01 {

	public static void main(String[] args) {
		
//		SingletonTest s = new SingletonTest();
//		s.sleep();
		
		//싱클톤 패턴은 무조건 객체가 하나만 만들어진다.
	}

}

class SingletonTest{
	int age;
	private SingletonTest() {
	}
	void sleep() {
		System.out.println("잔다...");
	}
}
