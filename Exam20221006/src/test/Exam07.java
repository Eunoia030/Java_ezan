package test;

public class Exam07 {

	public static void main(String[] args) {
		
		System.out.println(5>2 && 2<5);
		System.out.println(5>2 && 2>5);
		
		int num  = 6;
		
		if( num%2 == 0 && num %3 == 0); 
			System.out.println("2의 배수이면서 3의 배수인 값"); // && = 이면서 (and)
		if( num%2 == 0 || num %3 == 0 ); 
			System.out.println("2의 배수이거나 3의 배수인 값"); // || = 이거나 (or)
			
		// 조건식은 결과값이 빠른 것을 먼저 입력해야 한다.
			
		//비트 연산자
			
			int a = 15;     // a의 이진수 = 1 1 1 1
			int b = 10;     // b의 이진수 = 1 0 1 0 
			
			System.out.println(a | b); 
			System.out.println(a & b); 
			System.out.println(a ^ b); 
			System.out.println(a % ~b); 
				
	}

}
