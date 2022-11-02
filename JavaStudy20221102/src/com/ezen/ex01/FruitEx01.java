package com.ezen.ex01;

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

class AppleBox {
	private Apple ap;
	public void set(Apple a) { ap = a; }
	
	public Apple get() { return ap;}
	
}

class OrangeBox {
	private Orange or ;
	public void set(Orange o) { or = o; }
	
	public Orange get() { return or;}
	
}


public class FruitEx01 {
	
	public static void main(String[] args) {
		
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		
		aBox.set(new Apple());
		oBox.set(new Orange());// 참조하고 있는 참조변수나 새로운 객체를 넣어줘야 한다.
		
		Apple a = aBox.get();
		Orange b = oBox.get();
		
	}

}
