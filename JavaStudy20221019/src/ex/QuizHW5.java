package ex;

public class QuizHW5 {

	public static void main(String[] args) {
		
		/*배열 하나에 각 40개의 (중복없는) 랜덤한 정수(20)를 넣고 홀수(20)값만 있는 배열과 짝수값만 있는 배열을 각각 만들어 내림차순으로 정렬하세요.
		 * (단, 랜덤값의 범위는 1~40까지의 정수이다.) 
		 * */
		int [] number = new int [40];
		int [] odd= new int[40];
		int [] even= new int[40];
		
		for(int i=0; i<number.length; i++)
			number[i]= (int)(Math.random()*40)+1;
		
		for(int i=0; i<number.length; i++) {
			if(number[i]%2 ==0)
				odd[i] = number[i];
			else
				even[i] =number[i];
		}
		
	}		
	
}
