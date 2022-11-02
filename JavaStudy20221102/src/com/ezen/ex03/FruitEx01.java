package com.ezen.ex03;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		
		return "I am an Orange.";
	}
}


class Box {
	private Object ob;
	public void set(Object a) { ob = a; }
	
	public Object get() { return ob;}
	
}


public class FruitEx01 {
	
	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();
		
//		aBox.set("Apple");	// new Apple() 가 정상
		aBox.set(new Apple());
		bBox.set(new Orange());
		
//		String a =(String)aBox.get(); 	//  만약 String 으로 받았을때, 형변환은 String 으로만 가능 !!
		Apple a =(Apple)aBox.get(); //  object 타입으로 받은 것을  apple타입으로 형변환!! ob를 a에게 전달
		
	}

}
