package com.ezen.ex1;

public class InheritanceEx0_ex {
	public static void main(String[] args) {
		
		person_0 김강사 = new person_0("김강사", 45);   //생성자가 없을시 에러
		System.out.println(김강사.name );
		System.out.println(김강사.age );
		System.out.println("====================" );
		
		
		stu s = new stu();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.major);
		System.out.println(s.no);
		System.out.println("===========================");
//		
		stu 이상호 = new stu("이상호",28,"java","111");
		System.out.println(이상호.name);
		System.out.println(이상호.age);
		System.out.println(이상호.major);
		System.out.println(이상호.no);
		System.out.println("===========================");
		
		stu 이예찬 = new stu("이예찬",25,"java","22222");
		System.out.println(이예찬.name);
		System.out.println(이예찬.age);
		System.out.println(이예찬.major);
		System.out.println(이예찬.no);
		System.out.println("===========================");
//		
		
		sportsMan_0 손흥민 = new sportsMan_0("손흥민",30,"축구");
		System.out.println(손흥민.name);
		System.out.println(손흥민.age);
		System.out.println("--------------------------------");
		
		sportsMan_0 김하성 = new sportsMan_0("김하성",27,"야구");
		System.out.println(김하성.name);
		System.out.println(김하성.sports);
		System.out.println("--------------------------------");
		
		sportsMan_0 김연아 = new sportsMan_0();
		System.out.println(김연아.name);
		
		System.out.println("--------------------------------");
		
		WorkStudentPerson 김조장 = new WorkStudentPerson("김조장",24,"java","33333","껌 붙이기");
		System.out.println(김조장.name);
		System.out.println(김조장.job);
		
		
		person_0 최영태 = new WorkStudentPerson("최영태", 29, "java", "55555", "껌떼기");
		
		
	}

}
//사람 
class person_0 {
	String name;
	int age;
	
//	Person(){
//		
//	}
	
	person_0(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	void sleep() {
		System.out.println("잠을 잔다...");
	}

	void eat() {
		System.out.println("먹는다...");
	}
	
	void study() {
		System.out.println("공부한다..");
	}
	
}

//학생 중에 학내에서 일하는 근로학생
class WorkStudentPerson extends stu{
	String job;//일하는 종류
	
	public WorkStudentPerson (String name, int age, String major, String no, String job) {
		super(name,age,major,no);
		this.job = job;
	}
	
	void work() {
		System.out.println("일한다..");
	}
}



//사람들 중에 학생
class stu extends person_0 {

	String major; //전공
	String no; //학번
	
	public stu() {
//		super(); //
		this(null , 0, null,null);   
	}
	public stu(String major, String no) {
		super("이예찬",25);    // super()
		this.major =major;
		this.no = no;
	}
	public stu(String name, int age, String major, String no) {
		super(name, age);    // super()
		this.major =major;
		this.no = no;
	}
	
}

class sportsMan_0 extends person_0{
	String sports; //운동 종목
	
	public sportsMan_0() {
		this(null,0,null);
	}
	
	
	public sportsMan_0(String name, int age, String sports) {
		super(name,age);
		this.sports = sports;
	}
	
	void 운동한다() {
		System.out.println("운동한다..");
	}
}


