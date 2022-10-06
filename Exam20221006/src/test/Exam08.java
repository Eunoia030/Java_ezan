package test;

public class Exam08 {

	public static void main(String[] args) {
		
		// 쉬프트 연산자 >> << 
		
		int num = 8; // 2진법 : 00001000
		
		System.out.println(num<<2); //  왼쪽으로 두번이동 2진법: 00100000 = 32 :2의 5승
		
		System.out.println(num>>2); //  오른쪽으로 두번이동  2진법: 00000010 = 2 : 2의 1승

	}

}
