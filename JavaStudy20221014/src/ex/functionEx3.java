package ex;

import java.util.Scanner;

public class functionEx3 {

	public static void main(String[] args) {
		
		/* 인자, 매개변수
		 * 매개변수 O(입력),  반환X(출력)
		 * 함수 --> 원형, 정의, 호출 (c언어세어 구분..)
		 */
		System.out.println("함수 프로그램!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num=sc.nextInt();
		System.out.println("main: "+ num);
		//    인자
		func1(num);
		System.out.println("main함수 종료!");
		
	}
	
	
		// void(자리)는 반환타입을 결정, func1는 함수 이름(변수 명명규칙과 동인)
		// void는 반환 타입이 없다. 즉, return하지 않는다.
		static void func1(int n) {  //num의 같은 타입인 int n로 변환한다.
			
			System.out.println("func1: " + n*2);
				
	}

}
