package ex1;

public class FlowEx03 {
	public static void main(String[] args) {
		
		//구구단
		//for문
	
		for(int a = 2; a<10; a++ ) {
			for(int b=1; b<10; b++)
				System.out.println(a + "*" + b + "=" + a*b);
			System.out.println();
		}
		
		
		
		
		//while문
		int i =2;
		
		while(i<=3) {
			int j=1;
			while(j<=9) {
				System.out.println(i +"*"+j+"="+i*j);
			j++;
		}
		i++;
		System.out.println();
		}
		
		
		
		boolean flag = true;
		
		int k = 0;
		
		while(flag) {
			System.out.println("______________");
			if(k++>1)
				flag = false;
		}
	}
}
