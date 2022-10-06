package test;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		/* Exam
		 * 키보드로 4000을 입력받는다. (4000초)
		 * 사칙연산을 이용해서 시 분 초로 변경
		 * 1시간 6분 40초
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산하실 시간은 몇 초인가요?"); //입력받기
		
		int exam = sc.nextInt(); //입력값을 exam으로 설정
		
		int hour = exam/3600; // 시간값 구하기 -> 1시간 = 3600초
		
		int rem = exam%3600; // 계산한 시간값의 나머지
		
		int min = rem/60; // 남은 값에서 분값 구하기 -> 1분 = 60초
		
		int sec = rem%60; // 분값에서 나온 나머지값 = 초
		
		
		System.out.println("입력하신 "+ exam + "초를 시,분,초로 변경하면 " +hour+"시 "+ min + "분 " + sec +"초 입니다.");

		
		// 강사님 풀이
		
//		Scanner sc1 = new Scanner(System.in);
//		
//		System.out.println(System.in);
//		
//		int time = sc1.nextInt();
//		int hour = 0;
//		int minute = 0;
//		int second = 0;
//		
//		second = time % 60;
//		minute = time /60;
//		hour = minute%60;
//		
//		System.out.println("time:" + time);
//		System.out.println(hour + "시" + minute + "분" + second + "초");
//		
		
		 

	}
}
