package com.ezen.ex1;

public class Exercise7_7 { 
	// 다음 코드의 실행했을때 호출되는 생성자의 순서와 실행결과를 적으시오.
	
	// 1-2-3-4

	public static void main(String[] args) {
		
		Child c = new Child(); 
		
		System.out.println("x = "+c.getX()); 	// 0   

	}

}
class Parent {
	int x = 100;		
	
	Parent() {			// 2
		this(200);
		System.out.println("Parent()");
	}
	Parent(int x){		// 1
		this.x = x;
		System.out.println("Parent(int x)");
	}
	int getX() {		 
		return x;
	}
}
class Child extends Parent {
	int x = 3000;		
	Child() {				
//		super(1000);
		this(1000);
		System.out.println("Child()");    // 4
	}
	Child(int x) {			
		this.x = x;
		System.out.println("Child(int x)");   // 3
	}
}
