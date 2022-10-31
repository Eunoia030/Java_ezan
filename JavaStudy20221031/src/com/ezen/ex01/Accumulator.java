package com.ezen.ex01;


//출력 결과 
// sum = 45

public class Accumulator {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
		
	}
	
	static void add(int i) {
				
		sum += i;
	}

	static void showResult() {
		
		System.out.println("sum = " + sum );
	}

}
