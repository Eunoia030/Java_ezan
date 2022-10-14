package ex;

import java.util.Arrays;

public class Array000 {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
//		int[] destNum = new int[10];
		int[] destNum = new int[num.length*2];
		
		//num배열을 destNum배열로 복사
		for(int i=0; i<num.length; i++)
			destNum[i] = num[i];
		
		//배열 index 5부터 9까지 변화
		for(int i=num.length; i<destNum.length; i++)
			destNum[i]=10*(i+1);
		System.out.println(destNum.length);
		System.out.println(Arrays.toString(destNum));
		System.out.println("-----------------------");
		
		int[] num2 = new int[num.length*2];
		
		System.arraycopy(num, 0, num2, 0, num.length);
		//System.arraycopy(num, 2, num2, 0, 3);
		System.out.println(Arrays.toString(num2));
		
		int sum =0;
		int avg =0;
		int[] score= {100, 83, 76, 32, 83};
		
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		
		int [] score2 = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score2[0];
		int min = score2[0];
		
		for(int i=1; i < score2.length; i++) {
			if(score2[i]>max) {
				max = score2[i];}
			
			if(score2[i]<min) {
				min = score2[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		int[]ball = new int[45];
		
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		int tmp=0;
		int j=0;
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp; 
			
			/* ex)볼 5까지 배열을 재정립하는데 볼3에 해당하는 난수 j가32라고 가정할때 볼3자리의 변수를 tmp에 옮겨놓고 볼3에는 볼32의 변수를 옮김
			   	  그리고 tmp에있던 볼3에 해당하던 변수를 볼32로 옮김 */
			//  결과적으로 볼0~5까지에 해당되는 숫자는 랜덤하게 뽑아진 0~44까지에 해당하는 볼자리의 변수와 맞바꿔짐
			 
		}
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d] = %d\n" , i, ball[i]);
		
		int[] num0 = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<num0.length; i++) {
			num0[i] = (int)(Math.random()*10);
			System.out.print(num0[i]);
		}
		System.out.println();
		for(int i=0; i<num0.length; i++) {
			counter[num0[i]]++;
		}
			for(int i=0; i<num0.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}
		
	}

}
