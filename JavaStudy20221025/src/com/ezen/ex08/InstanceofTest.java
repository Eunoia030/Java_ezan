package com.ezen.ex08;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName());
		System.out.println(fe.getClass());
	}
}
//class
class Car{}
class FireEngine extends Car {}