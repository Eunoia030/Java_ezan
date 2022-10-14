package ex;

public class Array00 {

	public static void main(String[] args) {
		int[] score= new int[10];
		
		//배열 저장(random 이용.. 1~100사이)
		for(int i=0; i < score.length; i++) {
			score[i] = (int)(Math.random()*100)+1;
		}
		
		
		
		
		//배열 출력
		
		 for(int i=0; i<score.length;i++) 
		 System.out.print(score[i] + ",");
		 System.out.println();
		
		//배열 총합과 평균 구해서 출력
		int sum = 0;
			for(int i=0; i<score.length;i++) {
				sum += score[i];

			
			}
			System.out.println("배열의 총합 = " + sum );
			System.out.println("배열의 평균 = " + (double)sum/score.length);
		//배열 최댓값, 최솟값 출력
		int max = score[0];
		int min = score[0];
		for(int i=1; i<score.length;i++) {
			if(score[i]>max) 
				max = score[i];
			if(score[i]<min)
				min = score[i];
			}
		
		System.out.println("배열의 최댓값 =" + max);
		System.out.println("배열의 최솟값 =" + min);
		
		System.out.println("-------------------");
		//작은순서에서 큰순서대로 정렬(오름차순)
		for(int i=0; i<score.length;i++) {   //0번부터 시작했으면 처음하나만 정렬되기에 모두 정렬하기 위해 배열만큼 실행해야함
			for(int j=0; j<score.length-1-i;j++) {  //서로비교하기 위한for문 0vs1 1vs2...8vs9
				if(score[j]>score[j+1]) {
					int temp = score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
		}		 
		for(int i=0; i<score.length;i++) System.out.print(score[i] + ",");
		 System.out.println();
		
		
	}

}