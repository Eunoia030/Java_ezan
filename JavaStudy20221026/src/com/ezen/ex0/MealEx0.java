package com.ezen.ex0;

abstract class 주식문화 {
	abstract void 먹는다 (); 
//		System.out.println("아무것도 안먹는다...");
}

class 중국인 extends 주식문화{
	@Override
	void 먹는다() {		// 추상클래스를 상속받았을때 그 안에 있는 내용( 추상메소드 ) 를 채워야한다. 안하면 에러가 생긴다!!
	}						// 
}



class 한국인 extends 주식문화 {
	@Override
	void 먹는다() {
		System.out.println("한국인은 밥이 주식!!");
	}
}

class 미국인 extends 주식문화 {
	@Override
	void 먹는다() {
		System.out.println("아메리칸은 빵이지!");
	}
	
}

class 동남아 extends 주식문화 {
	@Override
	void 먹는다() {
		System.out.println("동남아는 국수랍니다~");
	}
	
}

public class MealEx0 {
	public static void main(String[] args) {
		주식문화 한 = new 한국인();
		한.먹는다();
		
		한 = new 미국인();
		한.먹는다();
	
		한 = new 동남아();
		한.먹는다();
		
	}
}
