package ex1;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		
//		/*switch 문*/
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("1번 입력");
//			break; // break를 추가하여 아래 다른 case들을 출력하지 않게 하기 // break 가 없을 경우 아래 case들이 전부 출력됨
//		case 2:
//			System.out.println("2번 입력");
//			break;
//		case 3:
//			System.out.println("3번 입력");
//			break;
//		case 4:
//			System.out.println("4번 입력");
//			break;
//		default:
//			System.out.println("1~4번외 입력");
//			
//		System.out.println("program 종료!!!!");
//		}
//		
//		////////////////////////////////////////////////
//		
//		
//		Scanner sc0 = new Scanner(System.in);
//		
//		String str = sc0.nextLine();
//		
//		switch(str) {
//		case "aaa": //"aaa"= 정수, 문자 = 제약 조건이 크다보니 정확한 것으로만 자리할수 있다.// 10>aaa등 사용 안됨
//			System.out.println("aaa번 입력");
//			break; 
//		case "bbb":
//			System.out.println("bbb번 입력");
//			break;
//		case "ccc":
//			System.out.println("ccc번 입력");
//			break;
//		case "ddd":
//			System.out.println("ddd번 입력");
//			break;
//		default:
//			System.out.println("그외 입력");
//			
//		System.out.println("program 종료!!!!");
//		}
		
		/* 점수 따른 학점 출력확인하기
		 * 90: A    80:B    70:C  .... */
		
		//풀이 1
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("당신의 학점은 몇점입니까? (1~100)");
//		int s = sc1.nextInt();
//		
//		switch(s/10) {
//		case 10: case 9: 
//			System.out.println("당신의 학점은 A입니다.");
//			break;
//		case 8:
//			System.out.println("당신의 학점은 B입니다.");
//			break;
//		case 7:
//			System.out.println("당신의 학점은 C입니다.");
//			break;
//		case 6:
//			System.out.println("당신의 학점은 D입니다.");
//			break;
//		case 5: 
//			System.out.println("당신의 학점은 E입니다.");
//			break;
//		default:
//			System.out.println("당신의 학점은 F입니다.");
//		
//		}
//		
//		//풀이2
//		System.out.println("당신의 학점은 몇점입니까? (1~100)");
//		int sc = sc1.nextInt();
//		int su = sc/10;
//		String grade = "0";
//		
//		switch(su) {
//		case 10: case 9: 
//			grade="A";
//			break;
//		case 8:
//			grade="B";
//			break;
//		case 7:
//			grade="C";
//			break;
//		case 6:
//			grade="D";
//			break;
//		case 5: 
//			grade="E";
//			break;
//		default:
//			grade="F";
//		
//		}
//		System.out.println("당신의 학점은 "+grade+"입니다.");
		
			
		/* 현재 계절 확인하기 */
			
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("현재 몇월인가요? ->'__'월");
//		int month = sc2.nextInt();
//		switch(month) {
//		case 3: case 4: case 5:
//			System.out.println("현재 계절은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재 계절은 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("현재 계절은 가을입니다.");
//			break;
//		default:
//			System.out.println("현재 계절은 겨울입니다.");
//		
//		}
		
		
		// 가위바위보 게임
//		
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("가위(1),바위(2),보(3) 중 하나를 선택해주세요->");
//		int user = sc3.nextInt();
//		int com = (int)(Math.random()*3) + 1;  //Math.random()*가지수 + 1= 랜덤 
//		
//		System.out.println("당신은 "+user+"입니다.");
//		System.out.println("컴퓨터는 "+com+"입니다.");
//		
//		switch(user-com) {
//		case 2: case -1:
//			System.out.println("com 승리");
//			break;
//		case 1: case -2:
//			System.out.println("user 승리");
//			break;
//		case 0:
//			System.out.println("비겼습니다.");
//		}
//		System.out.println("user:" + user + ", com:"+ com);
						
		
//		
//		//switch 
////		 주민번호를 입력하여 성별 구별하기 = 입력8번째자리 (남자1/3  , 여자 2/4 )
//		Scanner sc4 = new Scanner(System.in);
//		System.out.println("당신의 주민번호를 입력해주세요 -> ex)221011-4077827");
//		String no= sc4.nextLine();
//		char gender = no.charAt(7); //charAt(a) =  'a'번째 자리
//		
//		switch(gender) { //조건1
//		case '1': case '3':
//			System.out.println("당신은 남성입니다.");
//			break;
//			
//		case '2': case '4':
//			System.out.println("당신은 여성입니다.");
//			break;
//		default:
//			System.out.println("유효하지 않은 주민번호입니다. 다시 확인해주세요.");
//		
//		}
		
		
		
//		//switch 중첩 
////		 주민번호를 입력하여 성별 구별하기 = 입력8번째자리 (2000년전후 남자1/3  , 여자 2/4 )
//		Scanner sc5 = new Scanner(System.in);
//		System.out.println("당신의 주민번호를 입력해주세요 -> ex)221011-4077827");
//		String no1= sc5.nextLine();
//		char gender1 = no1.charAt(7); //charAt(a) =  'a'번째 자리 // 첫 시작은 0번째부터라고 인식
//		
//		switch(gender1) { //조건1
//		case '1': case '3':
//			switch(gender1) {//조건2-1
//			case '1':
//				System.out.println("당신은 2000년대 이전 태어난 남성입니다.");
//				break;
//			case '3':
//				System.out.println("당신은 2000년대 이후 태어난 남성입니다.");
//			
//			}
//		case '2': case '4':
//			switch(gender1) {//조건2-2
//			case '2':
//				System.out.println("당신은 2000년 이전 태어난 여성입니다.");
//				break;
//			case '4':
//				System.out.println("당신은 2000년 이후 태어난 여성입니다.");
//			}
//			break;// 조건 1 종료
//		default:
//			System.out.println("유효하지 않은 주민번호입니다. 다시 확인해주세요.");
//		
//		}
		
//		//로또 .. (1~45) //반복문이용
//		
//				Scanner sc3 = new Scanner(System.in);
//				
//				for (int i =0; i<6; i++) {
//					int com = (int)(Math.random()*45+1);
//					System.out.println(com); //  <= com +","
//				}
//		//로또 .. (1~45) //반복문이용X
//		
//				Scanner sc3 = new Scanner(System.in);
//				
//				int com = (int)(Math.random()*45+1);
//				System.out.println(com+",");
//				int com1 = (int)(Math.random()*45+1);
//				System.out.println(com1+",");
//				int com2 = (int)(Math.random()*45+1);
//				System.out.println(com2+",");
//				int com3 = (int)(Math.random()*45+1);
//				System.out.println(com3+",");
//				int com4 = (int)(Math.random()*45+1);
//				System.out.println(com4+",");
//				int com5 = (int)(Math.random()*45+1);
//				System.out.println(com5);
		
		//1~10까지의 합
//		int sum = 0;
//		for(int i=1; i<=10; i++)
//			sum += i;   //sum = sum+i
//		System.out.println("1~10까지의 합은 "+ sum + "입니다.");
		
	
		int sum = 0;
		for(int i=1; i<=15; i+=2)
			sum += i;   //sum = sum+i
		System.out.println("합은 "+ sum + "입니다.");
		
				
				
				
		
	}
}


