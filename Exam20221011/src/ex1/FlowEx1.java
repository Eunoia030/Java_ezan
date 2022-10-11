package ex1;

public class FlowEx1 {

	public static void main(String[] args) {
		
		//예제 4-1
		int x= 0;

		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		
		if(true)
			System.out.println("!(x!=0)");
			System.out.println("if문 테스트중...");
		System.out.println();
		
//		if(false)							//-> 조건이 틀리지 않기에 출력 X 
//			System.out.println("x==0");
//		System.out.println();
		
//		if(!(x!=0)) System.out.println("!(x!=0)");
		System.out.println();

		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		

	}

}
