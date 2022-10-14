package ex;

import java.util.Scanner;

public class functionEx6 {

	public static void main(String[] args) {
		
		System.out.println("함수 프로그램");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수입력: ");
		int num = sc1.nextInt();
		int m = p();
		System.out.println("입력한 정수: " + num + "p에서 받은 값: " + m );
	}
		static int p() {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("p에 입력할 정수를 입력해주세요.  -> ");
			int r = sc2.nextInt();
			int sum = r*2;
			return sum;
			
		
			
	}

}
