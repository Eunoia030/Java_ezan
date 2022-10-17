package ex;

public class MyInfo {

	public static void main(String[] args) {
		ClassInfo 홍길동  = new ClassInfo();
		홍길동.setName("홍길동");
		홍길동.setAddress("안산");
		홍길동.setTrafic("자차");
		홍길동.setTime(30);
		홍길동.show();
		
		System.out.println();
		ClassInfo 토굴이 = new ClassInfo();
		토굴이.setName("임채리");
		토굴이.setAddress("수원");
		토굴이.setTrafic("버스");
		토굴이.setTime(25);
		토굴이.show();
	}

}


class ClassInfo{
	String name;
	String address;
	String trafic;
	int time;
	
	void setName(String n) {
		name = n;
	}
	void setAddress(String a) {
		address = a;
	}
	void setTrafic(String t) {
		trafic = t;
	}
	void setTime(int ti) {
		time = ti;
	}
	void show() {
		System.out.print(" 이름 : " + name);
		System.out.print(",  주소 : " + address);
		System.out.print(",  교통편 : " + trafic);
		System.out.print(",  시간 : " + time + "분");
	}
}