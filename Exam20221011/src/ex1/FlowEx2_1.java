package ex1;

import java.util.Scanner;

public class FlowEx2_1 {

	public static void main(String[] args) {
		/* 점수에 따른 학점 출력프로그램
		*학점 A:90 B:80 C:70 D:60 F
		*/
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
		//중첩if문
//		if(num >= 90 )
//			System.out.println("학점A");
//		else {
//			if(num>=80)
//				System.out.println("학점B");
//				else {
//					if(num>=70)
//						System.out.println("학점C");
//					else {
//						if(num>=60)
//							System.out.println("학점D");
//						else
//							System.out.println("학점F");
//					}
//				}
//			}
		
		//또다른 조건문
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num >= 90 )
//			System.out.println("학점A");
//		else if(num>=80)
//			System.out.println("학점B");
//		else if(num>=70)
//			System.out.println("학점C");
//		else if(num>=60)
//			System.out.println("학점D");
//		else if(num>=50)
//			System.out.println("학점E");		
//		else
//			System.out.println("학점F");

		
		// 또다른 조건식
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 점수를 입력해주세요. >");
//		int num = sc.nextInt();
//		char grade = ' ';
//		
//		
//		if (num>=90 && num<=100) {
//			grade = 'A';
//		}
//		else if (num>=80){
//			grade = 'B';
//		}
//		else if (num>=70){
//			grade = 'C';
//		}
//		else if (num>=60){
//			grade = 'D';
//		}
//		else if (num>=50){
//			grade = 'E';
//		}
//		else {
//			grade = 'F';
//		}
//		
//		System.out.println("당신의 학점은 " + grade +"입니다.");
		
		//또다른 조건식 2 => 수정중!!!!!
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 점수를 입력하세요 > ");
//		
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
//			if (num>=78) 
//				opt = "+";
//			
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
		
		
		/*사칙연산 프로그램
		 * 1: +, 2:-, 3:*, 4:/
		 * 정수 2개 입력, 사칙연산 기호 입력-> 3개 입력
		 * 10,20,4     10/20=0.5
		 * 10,20,1       10+20=30
		 * 
		 * if(참) 1문장실행
		 * if(참) {
		 * 문장1;
		 * 문장;
		 * }
		 * 
		 * if(참) 참 문장 실행
		 * else 거짓문장 실행
		 * 
		 * if (조건 1 참) 문장1
		 * else if(조건 2 참) 문장2
		 * else if(조건3 참) 문장3
		 * ..
		 * else 문장
		 */
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("계산하실 정수중 하나를 입력하세요 >> ");
//		int a = sc.nextInt();
//		System.out.println("사칙연산 기호를 입력해주세요 (1: +, 2:-, 3:*, 4:/) >>");
//		int b = sc.nextInt();
//		System.out.println("남은 정수를 입력해주세요 >> ");
//		int c = sc.nextInt();
		
		System.out.println("계산하실 정수 2개를 입력하세요 >> ");
		int a = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("사칙연산 기호를 입력해주세요 (1: +, 2:-, 3:*, 4:/) >>");
//		int b = sc.nextInt();
		// 만약, 기호로 입력한다면?
		sc.nextLine();
		String b = sc.nextLine(); // 문자열
		if(b.equals("+"))
			System.out.println(a+c);
		else if(b.equals("-"))
			System.out.println(a-c);
		else if(b.equals("*"))
			System.out.println(a*c);
		else if(b.equals("/"))
			System.out.println((double)a/c);
		else
			System.out.println("아냐아냐아냐 이게 아니라구~ 다시 입력하슈!");
		
//		if ( b == 1) 
//			System.out.println(a+"+"+c+"="+(a+c)+"입니다."); 
//		
//		else if ( b == 2 ) 
//			System.out.println(a+"-"+c+"="+(a-c)+"입니다."); 
//		else if ( b == 3 ) 
//			System.out.println(a+"*"+c+"="+(a*c)+"입니다."); 
//		else if( b == 4 ) 
//			System.out.println(a+"/"+c+"="+((double)a/c)+"입니다.");  //(double): 실수 = 소수점까지
//		
//		else
//			System.out.println("입력하신 번호는 잘못되었습니다. 다시 확인해주세요/");
//		
//		
//		//또다른 풀이
//		int x = 0;
//		
//		if ( b == 1) { 
//			x = a+c;
//		}
//		else if ( b == 2 ){ 
//			x = a-c;
//		}
//		else if ( b == 3 ){ 
//			x = a*c;
//		}
//		else if( b == 4 ){ 
//			x = a/c;
//		} 
//		
//		else
//			System.out.println("입력하신 번호는 잘못되었습니다. 다시 확인해주세요.");
//		
//		System.out.println("구하신 답은 "+ x +"입니다.");

		
		}

	}


