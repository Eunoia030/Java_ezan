package com.ezen.ex03;

public class ExceptionEx2 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		int[]arr = new int[50];
				
		for (int i = 0; i < 100; i++) {
	try {
			result = number / (int)(Math.random()*10);
			arr[i]=i;			
			System.out.println(result);
		}
			catch(ArithmeticException e) {
				System.out.println("예외 발생");	//  0 이 나오면 출력  
			}
		}
		
	}

}
