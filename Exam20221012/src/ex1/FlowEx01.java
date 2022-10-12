package ex1;

public class FlowEx01 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=5; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//
//		
		for(int i =0; i<5; i++) {
			for(int j=5; j>=0; j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
