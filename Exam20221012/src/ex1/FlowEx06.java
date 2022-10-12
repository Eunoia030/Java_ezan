package ex1;

public class FlowEx06 {

	public static void main(String[] args) {
//		
//		int sum = 0;
//		int i = 0;
//		while(true) {
//			if(sum >100)
//				break;
//			++i;
//			sum += i;
//		}
//		System.out.println("i=" +i);
//		System.out.println("sum=" +sum);

		
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++)
//				System.out.println(i + "*" + j +"="+i*j);
//			System.out.println();
//		}
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=i; j++)
//				System.out.println(i + "*" + j +"="+i*j);
//			System.out.println();
//		}
//		
//		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j +"="+i*j);
//				if(i<=j) break; //i==j 보다 안정적
//			}
//			System.out.println();
//		}
		
		
		//continue문
		
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j +"="+i*j);
//				if(i==j) continue; 
//			}
//			System.out.println();
//		}

		
		
		//3의배수를 뺀 정수를 출력하시오
		
		for(int i=0; i<=16; i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
			}
		
	}
}
