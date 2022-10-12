package ex1;

public class FlowEx04 {

	public static void main(String[] args) {
		
		
		int sum, i;
		sum = i = 0;
		
		do {
			sum += i;
			i++;
		} 
		while (i<=10);
		System.out.println("sum: "+ sum);
		
		
//		//for 문
//		int sum =0;
//		for(int i =1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("for: "+ sum);
		

	}

}
