package test;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 키보드로 두 정수를 입력 받아서 합을 구하는 프로그램 생성
		  */
		
//		System.out.print("합을 구할 두 정수중 하나를 입력해주세요->");
//		int num1 = sc.nextInt();
//		
//		System.out.print("합을 구하실 남은 정수를 입력해주세요->");
//		int num2 = sc.nextInt();
//		
//		int sum = num1 + num2;
//		
//		System.out.println("두정수의 합계는 " + sum + "입니다.");
		
		
		/* 연습문제2 성적의 평균을 구하세요. */
		
		System.out.println("학생의 이름을 입력해주세요: ");
		String str = sc.next();
		System.out.println("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		
		int sum0 = kor + eng + math;
		int sum00 = sum0 / 3;
		
		System.out.println(str+"님의 평균은 " + sum00 + "점 입니다." );
		
		
		//float + long -> float + float -> float
		
//		
//		short st; //~32000
//		int num = 50000; //2진수: 1100 0011 0101 0000
//		
//		st = (short)num;
//		
//		System.out.println("st: "+ st);
//		System.out.println("num: "+ num);
		
	}
}
