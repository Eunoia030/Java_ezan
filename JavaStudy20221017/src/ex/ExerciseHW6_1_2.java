package ex;

public class ExerciseHW6_1_2 { 
	public static void main(String args[]) { 
	
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	
	} 
}

class Student { 
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student (String N, int b, int n, int k, int e, int m){
		name = N;
		no = n;
		kor = k;
		eng = e;
		math = m;
	}

  int total(){
	  return kor+eng+math;
	  
  }
  
  float avg() {
	  return (kor+eng+math)/3;
	  
  }
  
  String info() {
	  return name+","+no+","+kor+","+eng+","+math+","+total()+","+avg();
  }
  
}
