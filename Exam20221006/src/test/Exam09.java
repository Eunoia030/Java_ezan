package test;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		
		/* 절대값 출력 프로그램 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.:");
		
		int num = sc.nextInt();
		int result;
		
		if(num > 0)								// 양수든 음수든 절대값으로 출력
			result = num;
		else
			result = num*(-1);
		
		System.out.println("num: "+result);
		
		
		System.out.println("정수를 입력하세요.:");
		int num2 = sc.nextInt();
		
		result = num2>0 ? num2:num2*(-1);
		
		System.out.println("num2: "+ result);
		
	
	}

}
