package com.ezen.ex01;

class Man {
	String name;
	
	public Man() {}
	
	public Man(String name) {
		this.name = name;
	}
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
	
class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan (String company, String position) {
		//super()
		this.company = company;
		this.position = position;
	}
	public BusinessMan (String company, String position, String name) {
		super(name);            
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}

public class BusinessManEX {
	public static void main(String[] args) {
		BusinessMan bm = new BusinessMan("이젠","경영");
		bm.tellYourInfo();

		
		BusinessMan bm2 = new BusinessMan("길동","전략","비밀");
		bm2.tellYourInfo();
		
		
	}
}