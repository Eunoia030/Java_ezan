package ex;

import java.util.Scanner;

public class FuntionEx1 {

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
		func1();
		System.out.println("main 프로그램 종료");

	}

	static void func1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 반환X, 매개변수X 두개의 정수를 입력 받아, 나누기 기능을 하는 프로그램을 작성하자!");
		System.out.println("정수 a를 입력해주세요. >> ");
		int a = sc.nextInt();
		System.out.println("정수 b를 입력해주세요. >> ");
		int b = sc.nextInt();
		
		System.out.println(a + "/" + b + "=" + (float)a/b);
		System.out.printf("%d/%d=%.1f\n", a ,b ,(float)a/b);
		
	}

}

