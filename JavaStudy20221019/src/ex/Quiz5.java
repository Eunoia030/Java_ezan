package ex;

import java.util.Arrays;

public class Quiz5 {

	public static void main(String[] args) {
		
		
		/* 배열 하나에 각 40개의 중복없는 랜덤한 정수를 넣고 홀수값만 있는 배열과 짝수값만 있는 배열을 각각 만들어 내림차순으로 정렬하세요.
		 * (단, 랜덤값의 범위는 1~40까지의 정수이다.) 
		 * */
//		
//		//내 풀이 sort()를 이용
//		
		int [] t = new int[40]; 
		
		
		for(int i =0; i<t.length; i++)
			t[i] = i+1;
		
		int temp = 0;
		int j =0;
		
		for ( int i = 1; i < t.length; i++) {
			j = (int)(Math.random()*40);
			temp = t[i];
			t[i]= t[j];
			t[j]=temp;
			}
		
		
		
		for (int i = 0; i<40; i++) {
				
			System.out.print(t[i]+" ");
		}
	
		System.out.println("\n내림차순으로 정렬하면..");
		for (int i = 0; i<40; i++) {
			Arrays.sort(t);// sort() = 내림차순으로 정렬
			System.out.print(t[i]+"  ");
		}
		System.out.println("\n[짝수배열]");
		for (int i =0; i<t.length; i++) {
			if(t[i]%2 == 0 ) {
				
				System.out.print(t[i] + " ");					
			}
		}
		System.out.println("\n[홀수배열]");
		for (int i =0; i<t.length; i++) {
			if(t[i]%2 != 0){		
				System.out.print(t[i]+" ");	
			}
			
		}
		

//		// sort를 이용하지 않은 강사님 방식
//		int[] number = new int[40]; // 랜덤하게 40개저장
//		int[] odd = new int[40];//짝수만
//		int[] even = new int [40];//홀수만
//		int index1, index2;
//		index1 = index2 =0;
//		for(int i = 0; i <number.length; i++)
//			number[i] = (int)(Math.random()*40)+1;
//		
//		for(int i = 0; i<number.length; i++) {
//			if(number[i]%2==0)
//				odd[index1++] =number[i];
//			else
//				even[index2++] =number[i];
//			
//		}
//		
//		int[]odd2 = new int[index1];
//		System.arraycopy(odd,  0, odd2, 0, index1);
//		int[]even2 = new int[index1];
//		System.arraycopy(even,  0, even2, 0, index2);
//		
//		for(int i =0; i<number.length; i++) {
//			System.out.print("\n"+number[i]+",");
//		}
//		for(int i =0; i<odd.length; i++) {
//			System.out.print("\n"+odd[i]+",");
//		}
//		for(int i =0; i<odd2.length; i++) {
//			System.out.print("\n"+odd2[i]+",");
//		}
//		for(int i =0; i<even.length; i++) {
//			System.out.print("\n"+even[i]+",");
//		}
//		System.out.println();
//		for(int i = 0; i<even2.length; i++) {
//			System.out.print(even2[i]+",");
//		}

		

	}

}
