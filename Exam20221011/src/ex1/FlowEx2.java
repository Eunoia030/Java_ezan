package ex1;

import java.util.Scanner;

public class FlowEx2 {
 
	public static void main(String[] args) {
		
		//예제 4-2
		
		int input;
		
		System.out.println("숫자를 하나 입력하세요. > ");
		
		Scanner sc = new Scanner(System.in);//객체
//		String tmp = sc.nextLine(); //입력정보 = tmp =문자 5 = 11 0101 
//		input = Integer.parseInt(tmp); //변환 = 101 = 숫자 5
//		다른 방법	
		input = sc.nextInt();
		
		
		if(input==0) { //참
			System.out.println("입력하신 숫자는 0 입니다.");
		}
//		if(input!=0) {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//			System.out.printf("입력하신 숫자는 %d 입니다.", input);
//			System.out.printf("입력하신 숫자는 "+input+"입니다.");
		else{ //거짓
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.", input);
			System.out.printf("\n 입력하신 숫자는 "+input+" 입니다.");	
		}
	}

}
