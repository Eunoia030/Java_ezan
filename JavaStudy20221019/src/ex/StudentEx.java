package ex;


public class StudentEx {
	public static void main(String[] args) {
		
		Student 홍길동 = new Student(); //디폴트 생성자 호출..
		
		홍길동.name ="홍길동";
		홍길동.ban =1;
		홍길동.no =1;
		홍길동.kor =100;
		홍길동.eng =60;
		홍길동.math =76;
		
		
		System.out.println("이름: "+홍길동.name);
		System.out.println("총점: "+홍길동.getTotal());
		System.out.println("평균: "+홍길동.getAverage());
		System.out.println("==============================");
		
		Student 이순신 = new Student("이순신",1,1,100,70,76);
//		Student 이순신 = new Student("이순신");
		System.out.println(이순신.name);
		System.out.println(이순신.info());
	}
}
		
	class Student{
		//ExerciseHW6~1/2/3 강사님 풀이
		
		String name; //학생이름
		int ban; // 반
		int no; // 번호
		int kor; // 국어
		int eng; // 영어
		int math; // 수학
		
		Student() {
			
		}
		
		Student(String name, int ban,int no,int kor,int eng,int math) {
			this.name = name; //this**
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
		}
		
		int getTotal() {
//			int sum = kor+eng+math;
//			return sum;          또는
			return kor+eng+math;
		}
		
		float getAverage() {
			float avg = getTotal()/3.0f;
//			float avg = (float)getTotal()/3.0;
			return avg;
				
		}
		
		String info() {
			  return name+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
		  }
		  
}
