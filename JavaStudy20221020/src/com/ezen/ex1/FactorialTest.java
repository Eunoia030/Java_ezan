package com.ezen.ex1;


public class FactorialTest {
	public static void main(String[] args) {
		
		Tests2 t =new Tests2();
		t.ivfunc();
	}
}

class Tests2 {
	
	int iv = 0;
	static int cv = 0;
	
	void ivfunc() {
		iv=0;
		cv = 0;
		cvfunc();
		testfunc();
		System.out.println("------");
	}
	
	static void cvfunc() {
		
//		cv = 100;
//		cvfunc();
//		testfunc();
		System.out.println("=========");
	}
	
	static void testfunc() {
		cv = 300;
//		cvfunc();
//		iv = 100;
//		ivfunc();
		System.out.println("++++++");		
	}
	
}