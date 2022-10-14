package ex;

public class functionEx7 {

	public static void main(String[] args) {
		
		int num;
		
		Sung 홍길동 = new Sung("홍길동",90,96,99);
		홍길동.총점();
		홍길동.평균();
		
		홍길동.show();
		
		Sung 이순신 = new Sung("이순신",77,80,92);
		이순신.총점();
		이순신.평균();
		
		이순신.show();
				}
	

}
class Sung{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	//생성자
	Sung(String n, int k, int e, int m)
	{
		name=n;
		kor =k;
		eng = e;
		math = m;
		
		
	}
	
	void 총점() {
		total=kor+eng+math;
	}
	void 평균() {
		avg =  total/3.0;
	}
	void show() {
		System.out.println("kor:" +kor);
		System.out.println("eng:" +eng);
		System.out.println("math:" +math);
		System.out.println("total:" + total);
		System.out.println("avg:" +avg);
		System.out.println();
	}
}
