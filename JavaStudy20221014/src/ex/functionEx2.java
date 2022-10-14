package ex;

import java.util.Scanner;

public class functionEx2 {

	public static void main(String[] args) {
		
		/* 인자, 매개변수
		 * 매개변수 X(입력),  반환O(출력)
		 * 함수 --> 원형, 정의, 호출 (c언어세어 구분..)
		 */
		System.out.println("함수 프로그램!!!");
		int n = func1(); // 함수 호출(메서드 호출)
		
		System.out.println("main: "+ n*2);
	}
	
	
		// void(자리)는 반환타입을 결정, func1는 함수 이름(변수 명명규칙과 동인)
		// void는 반환 타입이 없다. 즉, return하지 않는다.
		static int func1() {  //void 를 num의 같은 타입인 int 로 변환한다.
			System.out.println("매개변수, 반환형 있는 함수 테스트");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력: ");
			int num = sc.nextInt();
			System.out.println("func: "+num);
			
			return num;  //void = num의 타입이 일치해야 반환된다. 
	}

}
