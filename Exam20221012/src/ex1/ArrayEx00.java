package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx00 {

	public static void main(String[] args) {
		
		//Array 배열
		
//		// java의 정석예제
//		
//		int[] score = new int[6];
//		
//			for(int i=0; i<6; i++) {
//				int n = (int)(Math.random()*45)+1;
//				score[i]=n;
//			}
//		for(int i=0; i<6; i++) {
//			System.out.print(score[i] + ",");
//		}	
//		
//		
//		System.out.println();
//		System.out.println("==================");
//		
//		
//		// 내입맛대로 고쳐본 문제 및 풀이
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇개의 랜덤 정수를 고를까요? >> ");
//		int a = sc.nextInt();
//		System.out.println("랜덤한 정수의 최대값을 정해주세요 >>>>");
//		int max = sc.nextInt();
//		
//		int[] score_2 = new int[a];
//		
//		for(int i=0; i<a; i++) {
//			int n = (int)(Math.random()*max)+1;
//			score_2[i]=n;
//		}
//		for(int i=0; i<a; i++) {
//			if(i<(a-1))
//				System.out.print(score_2[i] + ",");
//			else
//				System.out.println(score_2[i]);
//		}
		
		
//		// 예제 5-4
//		
//		int[] score = new int[5];
//		int k =1;
//		
//		score[0] =50;
//		score[1] =60;
//		score[k+1] =70;
//		score[3] =80;
//		score[4] =90;
//		
//		int tmp = score[k+2] + score[4];
//		
//		for(int i=0; i<5; i++) {
//			System.out.printf("score[%d]:%d%n",i, score[i]);
//		}
//		System.out.printf("tmp:%d%n",tmp);
////		System.out.printf("score[%d]:",7,score[7]); // index 값을 넘음
//		System.out.println(score.length); //length = 배열의 길이를 알려준다.
		
		
		int[] score = new int[] {50,60,70,80,90};
		int k =1;
		
		int tmp = score[k+2] + score[4];
		
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);
		}
		System.out.printf("tmp:%d%n",tmp);
		System.out.println(score.length); //length = 배열의 길이를 알려준다.
		
		//예제 5-2
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80 , 70 ,60};
		int[] iArr3 = {100, 95, 80 , 70 ,60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i=0; i < iArr1.length ; i++) {
			iArr1[i] = i+1;
			}
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) +1;
			}
		for(int i =0; i < iArr1.length; i++) {
				System.out.print(iArr1[i]+",");
			}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}

}
