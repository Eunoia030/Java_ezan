package ex1;

public class FlowEx02 {

	public static void main(String[] args) {
		// while 문
		
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("for: " + sum);
		
		sum = 0 ; // sum 초기화
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("while: "+ sum);
	}

}
