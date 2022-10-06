package test;

public class Exam06 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int result1 = a*a/a;  // 결과값이 -727이 나온다. why? int의 최대값을 넘어 다시 최소값인 -로 시작하기 때문에 결과값은 -727로 나온다.

		// 그렇다면? 우리가 알고 있는 수로 준다면 어떻게 해야 할까? -> 더 큰 용량인 long으로 변환하여 값을 계산하면 된다. 방법은 두가지
//		long result1 = (long)a*a/a;  
//		int result1 = (int)((long)a*a/a);
		// int * int ==> int
		//long * int ==> long * long ==> long
//		System.out.println(result1);
		
		//아스키 코드를 이용한 문제
//		char a = 'a';
//		char d = 'd';
//		char zero = '0';
//		char two = '2';
//		
//		System.out.printf("'%c'-'%c' = %d%n", d, a, d-a);
//		System.out.printf("'%c'-'%c' = %d%n", two, zero, two - zero);
//		System.out.printf("'%c'= %d%n", a, (int)a);
//		System.out.printf("'%c'= %d%n", d, (int)d);
//		System.out.printf("'%c'= %d%n", zero, (int)zero);
//		System.out.printf("'%c'= %d%n", two, (int)two);

		// 아스키코드 0 =48 // A= 65 // a = 97

		/* 연산자 true , false ( < , > , >= , <= , == ,!= ) */
		
		// 기준!!! A > B 랍니다~!
		int a = 5;
		int b = 5;
		
		System.out.println(a>b); 
		System.out.println(a<b); 
		System.out.println(a>=b); 
		System.out.println(a<=b); 
		System.out.println(a==b); 
		System.out.println(a!=b); 

		String str1 = "korea";
		String str2 = "korea";
		String str3 = new String("korea");
		String str4 = new String("korea");
		
		System.out.println("---------");
		System.out.println(str1==str2);
		System.out.println(str1==str3); // 자체 값이 같아도 저장되어 있는 값이 달라, false 로 나온다.
		System.out.println(str3==str4);
		
		System.out.println("---------"); // 그렇다면 그 자체값으로만 확인 하려면 어떻게 해야할까?
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3)); //equals() ->객체가 달라도 비교하는 두 내용값이 같으면 true, 다르면 false //를 사용하면 된다.
		System.out.println(str3.equals(str4));
		
		//대소문자를 구별하지 않고 비교하려면 equalsIgnoreCase() 를 사용한다.
				
	}

}
