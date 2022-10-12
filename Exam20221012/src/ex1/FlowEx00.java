package ex1;

import java.util.Scanner;

public class FlowEx00 {

	public static void main(String[] args) {
		
		/*정수 3개를 입력받아서 최대값과 최소값을 구하는 프로그램 작성*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 3개를 입력해주세요! ");
//		System.out.println("첫번째 정수를 입력해주세요! ");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수를 입력해주세요! ");
//		int b = sc.nextInt();
//		System.out.println("세번째 정수를 입력해주세요! ");
//		int c = sc.nextInt();
		
//		if (a > b) {
//			if ( a > c ) {
//				if (b > c)  // a > b > c
//					System.out.println("최댓값: "+ a +", 최소값: " + c);
//				
//				else if (b < c )  // a > c > b
//					System.out.println("최댓값: "+ a +", 최소값: " + b);
//				
//			}
//			else if (a < c) //c > a > b
//				System.out.println("최댓값: "+ c +", 최소값: " + b);
//		}
//		else if (a < b) {
//			if ( b > c ) {
//				if (a > c)  // b > a > c
//					System.out.println("최댓값: "+ b +", 최소값: " + c);
//				
//				else if (a < c)  // b > c > a
//					System.out.println("최댓값: "+ b +", 최소값: " + a);
//
//			else if (b < c) // c > b > a 
//				System.out.println("최댓값: "+ c +", 최소값: " + a);
//			
//		 }
//		}
//		else if (a==b) {
//			if (a>c) 
//				System.out.println("최댓값: "+ a +", 최소값: " + c);
//			else if ( a < c ) 
//				System.out.println("최댓값: "+ c +", 최소값: " + a);
//			else if ( a == c )
//				System.out.println("모두 같습니다.");			
//		}
//		else if ( a==c ) {
//			if (a>b) 
//				System.out.println("최댓값: "+ a +", 최소값: " + b);
//			if (a < b) 
//				System.out.println("최댓값: "+ b +", 최소값: " + a);
//			if ( a == b ) 
//				System.out.println("모두 같습니다.");
//		}
//		else 
//			System.out.println("알수없습니다.");
		
Scanner sc = new Scanner(System.in);
		
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		int in3 = sc.nextInt();
		int max=0,  min=0;
		
		System.out.println(in1 + ", " + in2 + ", " + in3);
		
		if( in1 > in2) {
			if( in1 > in3) {
				max = in1;
				if(in2 > in3) min = in3;
				else min  = in2;
			}
			else  {
				max = in3;
				min = in2;
			}
		}else {
			if( in2> in3) {
				max = in2;
				if( in3 > in1) min = in1;
				else min = in3;
			}
			else {
				max = in3;
				min = in1;
			}
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		
			
	}

}
