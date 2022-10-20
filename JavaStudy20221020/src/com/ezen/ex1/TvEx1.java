package com.ezen.ex1;

public class TvEx1 {
	static int num = 1;

	public static void main(String[] args) {
		
	
//		Tv2 tv = new Tv2();
				
//		tv.channel = 11;
		
//		System.out.println(tv.channel);
		System.out.println(Tv2.cv);
		System.out.println(TvEx1.num);
		for(int i=0; i<10; i++) {
			;
		}
	}

}
 //인스턴스 변수는 객체(인스턴스)를 생성 후에 사용해야한다.

class Tv2{
	String color; //iv (instance)
	boolean power; //iv
	int channel; 	//iv 
	static int cv =100; //cv (class)
	
	
	void power() {
		int num=10; //lv (local)
		power =! power;
	}
	
	void channelup() {channel++;}
	void channeldown() {channel--;}
}

