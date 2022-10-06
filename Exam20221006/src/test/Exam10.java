package test;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		// 조건식 (if문)
		// if문,   if~else문,   if ~else if ~else if ~else문
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수입력: ");
//		int num = sc.nextInt();
//		
//		if(num>0)
//			System.out.println("입력하신 정수 '"+ num +"'은 양수입니다.");
//		if(num==0)
//			System.out.println("입력하신 정수 '"+ num +"'은 zero입니다.");
//		if(num<0)
//			System.out.println("입력하신 정수 '"+ num +"'은 음수입니다.");
		
		
//		System.out.println("정수입력: ");
//		int num = sc.nextInt();
		
//		if(num>0)
//			System.out.println("입력하신 정수 '"+ num +"'은 양수입니다.");
//		else if(num==0)
//			System.out.println("입력하신 정수 '"+ num +"'은 zero입니다.");
//		else if(num<0)
//			System.out.println("입력하신 정수 '"+ num +"'은 음수입니다.");
		
//		System.out.println("점수입력: ");
//		int num = sc.nextInt();
//		
//		if(num>90)
//			System.out.println("당신은 A입니다.");
//		else if(num>80)
//			System.out.println("당신은 B입니다.");
//		else if(num>70)
//			System.out.println("당신은 C입니다.");
//		else if(num>60)
//			System.out.println("당신은 D입니다.");
//		else if(num>50)
//			System.out.println("당신은 E입니다.");
//		else 
//			System.out.println("당신은 F입니다.");
		
		
//		System.out.println("점수입력: ");
//		int num = sc.nextInt();
//		String grade = "";
//		String opt = "0";
//		
//		
//		if(num>=90) {
//			grade = "A";
//			if (num>=98) {
//				opt = "+";
//			}
//			else if (num < 94) {
//				opt = "-";
//			}
//		}
//		else if (num>=80) {
//			grade = "B";
//			if (num>=88) {
//				opt = "+";
//				}
//			else if(num < 84) {
//				opt = "-";
//			}
//		}
//		else if (num>=70) {
//			grade = "C";
//			if (num>=78) {
//				opt = "+";
//			}
//			else if(num < 74) {
//				opt = "-";
//			}
//		}
//		else if (num>=60) {
//			grade = "D";
//			if (num>=68) {
//				opt = "+";
//			}
//			else if (num < 64) {
//				opt = "-";
//				}
//		}	
//		else if (num>=50) {
//			grade = "E";
//			if (num>=58) {
//				opt = "+";
//			}
//			else if (num < 54) {
//				opt = "-";
//			}
//		}
//		else {
//			grade = "F";
//		}
//		
//		System.out.println("당신의 성적은 " + grade + opt + "입니다." );
		
		byte a = 10;
		byte b = 20;
//		byte c = a + b; // byte타입을 사칙연산을 하면 int 로 인식을 하기 때문에 크기가 맞지 않아 오류가 난다.
		byte c = (byte)(a + b); //수정후 
		System.out.println("c=" +c);
		
		
		System.out.println("------------------");
		
		char ch = 'A'; // ASC2 : 65
//		ch = ch + 2       // 위와 같은 이유
		ch = (char)(ch +2); // ASC2 : 65+2 = 67
		System.out.println("ch=" +ch);
		
		System.out.println("------------------");
		
//		float f = 3/2;
		float f = 3/2.0f;
		System.out.println("f=" +f);
		
		System.out.println("------------------");
		
//		long I = 3000 * 3000 * 3000; // 숫자중 한 곳에 long을 붙여 크기를 맞춘다.
		long I = (long)3000 * 3000 * 3000;  
		
		
		System.out.println("I=" +I);
		
		System.out.println("------------------");
		
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d == f2;
		System.out.println("result=" +result);
		
		

		
		
		
		
			
		
		

	
		
		
		
	}

}
