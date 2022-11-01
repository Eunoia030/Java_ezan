package com.ezen.ex01;
class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number =num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
	
	public void playApp() {
		}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("APP is running in "+ androidVer);
	}
}


public class Phone {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-1111", "djdj");
		MobilePhone ph2 = new SmartPhone("010-555-2222", "adf");
		
		
		ph1.answer();
		ph1.playApp();
		
		System.out.println();
		
		ph2.answer();
		
		ph2.playApp();
		
//		ph2.playApp();
		// 상위클개스 참조변수는 하위클래스를 참조할수있지만, 하위클래스 자원에는 접근 불가, 접근 허용되는 유일한 케이스는 오버라이딩한 경우이다.
	}
}
