package ex;

import java.util.Scanner;

public class functionEx4 {

	public static void main(String[] args) {
		
		/* 인자, 매개변수
		 * 매개변수 O(입력),  반환O(출력)
		 * main 함수에서 정수 하나 입력받아서
		 * 받은 값을 함수에게 전달..
		 * 함수는 그 값을 2배로 곱해서 메인함수에게 다시 전달..
		 * 메인함수는 입력 받은 값과 전달 받은 값을 출력
		 */
		System.out.println("함수 프로그램!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num=sc.nextInt();
		//    인자
		func1(num);
		int n = func1(num);
		System.out.println("main에서 입력받은 값: "+ num + ", func1에서 전달 받은 값: " + n  );
		System.out.println("main함수 종료!");
		
	}
	
	
		// void(자리)는 반환타입을 결정, func1는 함수 이름(변수 명명규칙과 동인)
		// void는 반환 타입이 없다. 즉, return하지 않는다.
		static int func1(int num) {  //num의 같은 타입인 int m로 변환한다.
			
			int m = num*2;
			return m;
			
			
			// 또는 return num*2;
			
	}

}
