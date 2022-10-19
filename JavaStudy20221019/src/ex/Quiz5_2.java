package ex;

public class Quiz5_2 {

	public static void main(String[] args) {
		
		/*배열 하나에 각 40개의 (중복없는) 랜덤한 정수(20)를 넣고 홀수(20)값만 있는 배열과 짝수값만 있는 배열을 각각 만들어 내림차순으로 정렬하세요.
		 * (단, 랜덤값의 범위는 1~40까지의 정수이다.) 
		 * */
		
		int[] num = new int[40];
		int[] odd = new int[20];
		int[] even = new int[20];
		int index1, index2 =0;
		index1 = index2= 0;
		
		
		for(int i=0; i<num.length; i++)
			num[i] = i+1;
		
		
		for(int i =0; i<num.length; i++ ) {
			int index = (int)(Math.random()*40);
			int tmp = num[i];
			num[i] = num[index];
			num[index] = tmp;
			
		}
		
		for(int i =0; i<num.length; i++) {
			System.out.print(num[i]+" ,");
		}
		System.out.println("\n=============================================================");
		//짝,홀수 분리해서 배열저장
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0)
				odd[index1++] =num[i];
			else
				even[index2++]=num[i];
		}
		
		//짝수에서 0을 제외한 입력데이터만 odd2저장
		int [] odd2 = new int[index1];
		System.arraycopy(odd,  0, odd2, 0, index1);
		
		//홀수에서 0을 제외한 입력데이터만 even2저장
		int[]even2 = new int[index1];
		System.arraycopy(even,  0, even2, 0, index2);
		
		for(int i =0; i<num.length; i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();
		for(int i =0; i<odd.length; i++) {
			System.out.print(odd[i]+",");
		}
		System.out.println();
		for(int i =0; i<odd2.length; i++) {
			System.out.print(odd2[i]+",");
		}
		System.out.println();
		for(int i =0; i<even.length; i++) {
			System.out.print(even[i]+",");
		}
		System.out.println();
		for(int i = 0; i<even2.length; i++) {
			System.out.print(even2[i]+",");
		}
		
		//내림차순 정렬
		System.out.println("\n=======================내람차순정렬===============================");
		
		
		for(int i=0; i<odd2.length; i++) {
			for(int j=i+1; j<odd2.length; j++) {
				if(odd2[i]<odd2[j]){
					int tmp = odd2[i];
					odd2[i] = odd2[j];
					odd2[j] = tmp;
				}
			}
		System.out.println();
		for(int k =0; k<odd2.length; k++)
			System.out.print(odd2[k]+",");
		
		}
		System.out.println("\n------------------------------------------------------------");
		System.out.println();
		for(int k =0; k<odd2.length; k++)
			System.out.print(odd2[k]+",");
	}		
	
}
