package ex;

public class functionEx1 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수 X(입력),  반환X(출력)
		 * 함수 --> 원형, 정의, 호출 (c언어세어 구분..)
		 */
		System.out.println("함수 프로그램!!!");
		func1(); // 함수 호출(메서드 호출)
	}
	
	
		// void(자리)는 반환타입을 결정, func1는 함수 이름(변수 명명규칙과 동인)
		// void는 반환 타입이 없다. 즉, return하지 않는다.
		static void func1() {
			System.out.println("매개변수, 반환형 없는 함수 테스트");

	}

}
