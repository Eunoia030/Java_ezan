package ex;

import java.util.Scanner;

public class functionEx5 {

	public static void main(String[] args) {
		
		/* 매개변수 있고, 반환형이 있는 경우
		 * 
		 * main함수에서 정수 2개를 입력받아서
		 * 받은 값을 함수에서 전달
		 * 함수는 그값을 더해서 
		 * 메인함수에서 다시 전달
		 * 
		 * 메인함수는 입력받은 값과 전달 받은 값을 출력
		 */
		System.out.println("함수 프로그램!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수 입력: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//    인자
		func1(a, b);
		
		int n = func1(a, b);
		System.out.println("main에서 입력받은 2가지의 값: "+ a +", "+ b + "  func1에서 전달 받은 값: " + n  );
		System.out.println("main함수 종료!");
		
	}
	
	
		// void(자리)는 반환타입을 결정, func1는 함수 이름(변수 명명규칙과 동인)
		// void는 반환 타입이 없다. 즉, return하지 않는다.
		static int func1(int a, int b) {  //num의 같은 타입인 int m로 변환한다.
			
			return a+b;
			
			
			// 또는 return num*2;
			
	}

}
