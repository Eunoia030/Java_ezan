package ex1;

import java.util.Scanner;

public class Exam_test {

	public static void main(String[] args) {
		// java 점프 투 자바 연습문제
		// 자료형
		//Q1. 홍길동 씨의 과목별 점수의 평균 점수 구하기
		//국어 80 / 영어 75 / 수학 55
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("국어, 영어, 수학 점수를 입력하시오");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int math = sc.nextInt();
//		int p = (kor+eng+math)/3;
//		System.out.println("종합 평균 점수는 "+ p +"입니다.");
		
		//Q2. 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 말해보자.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("0을 제외한 홀짝수를 판별할 자연수를 입력하시오->");
//		int num = sc.nextInt();
//		int n = num%2;
//		
//		if (n == 0) {
//			System.out.println("입력하신 자연수 '"+num+"'은 짝수입니다.");
//		}
//		else if (n > 0) {
//			System.out.println("입력하신 자연수 '"+num+"'은 홀수입니다.");
//		}
		
		//Q3. 입력받은 주민등록번호를 연월일 부분과 그 위의 숫자 부분으로 나누어 출력해보자.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 주민등록번호를 입력해주세요");
		String no = sc.next();
		String no1 = (no.substring(0,6));
		String no2 = (no.substring(7,13));
		
		System.out.println("당신의 출생년월일은 "+no1+"입니다.");
		System.out.println("당신의 주민번호 뒷자리는 "+no2+"입니다.");
		
		
	}

}
