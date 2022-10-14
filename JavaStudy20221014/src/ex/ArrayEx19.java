package ex;

public class ArrayEx19 {

	public static void main(String[] args) {
		
		int [][]score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		
		int korT=0, engT=0, mathT=0;
		
		System.out.println("번호  국어  영어  수학  총점    평균");
		System.out.println("============================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korT += score[i][0];
			engT += score[i][1];
			mathT += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j =0; j<score[i].length; j++) {
				sum+= score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length; //평균
			
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("==============================");
		System.out.printf("총점: %3d %4d %4d%n", korT,engT,mathT);
		System.out.println("반 평균 국어: " + korT/5  + " , 영어: " + engT/5 + " , 수학: "+ mathT/5);
		System.out.println("반 총 평균 : "+(korT+engT+mathT)/5/3);

	}

}
