package ex;

public class ExerciseHW6_1_3 { 
	public static void main(String args[]) { 
	
		Stu s = new Stu();
		
		s.name ="홍길동";
		s.ban =1;
		s.no =1;
		s.kor =100;
		s.eng =60;
		s.math =76;
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAverage());
		
	
	} 
}

class Stu{ 
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Stu(){
		
	}

  int getTotal(){
	  return kor+eng+math;
	  
  }
  
  float getAverage() {
	  return (kor+eng+math)/3;
	  
  }
  
  
}
