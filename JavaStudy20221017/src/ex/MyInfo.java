package ex;

public class MyInfo {

	public static void main(String[] args) {

		
		MyWedding 홍길동 = new MyWedding(183.2, 75.4,"잘 생겼다.", "배우");
		홍길동.set이름("홍길동");
		홍길동.set재산(100);
		홍길동.money();
//		홍길동.재산 =50;
		홍길동.show();
	}

}


class MyWedding{
	
	
	double 키;
	double 몸무게;
	long 재산; //private 외부에서 오는 간섭은 허용하지 않겠다는 뜻
	String 이름;
	String 가치관;
	String 직업;
	
	
	//생성자
	MyWedding(double h, double w, String n, String j) {
		키 = h;
		몸무게 = w;
		가치관 = n;
		직업 = j;
	}
	
	void set재산(long n) {
		재산 = n;
	}
	void set이름(String n) {
		이름 = n;
	}
	
	//메소드
	void song() {
		System.out.println(이름 + "노래를 잘한다.");
		
	}
	
	void sports() {
	
		System.out.println(이름 + "운동을 잘한다.");
		
	}
	
	void money() {
		System.out.println(이름 + "은 "+ 재산 + "억정도의 재산을 가지고 있습니다.");
	}
	void show() {
		System.out.printf(이름 + ","+키+","+몸무게+",",가치관+","+직업+","+재산+"억");
	}
}