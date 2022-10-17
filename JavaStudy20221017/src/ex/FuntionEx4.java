package ex;

import java.util.Scanner;

public class FuntionEx4 {

	public static void main(String[] args) {
		
		/*
		 * 함수 4가지 유형,
		 * 1. 반환X 매개변수X
		 * 2. 반환O, 매개변수O
		 * 3. 반환X, 매개변수O
		 * 4. 반환O, 매개변수X
		 * -----------------
		 * 두개의 정수를 입력 받아, 나누기 기능을 하는 프로그램을 작성
		 * */
		
		
		System.out.println("3. 반환O, 매개변수X 두개의 정수를 입력 받아, 나누기 기능을 하는 프로그램을 작성하자!");

		double result = func1();
		System.out.println("result: " + result );
		
		System.out.println("프로그램 종료");
	
	}

	static double func1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를 입력해주세요. >> ");
		int a = sc.nextInt();
		System.out.println("정수 b를 입력해주세요. >> ");
		int b = sc.nextInt();
	
		double result = (double)a/b;
		return result;
	

	}
}

