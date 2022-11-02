package com.ezen.ex02;

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
// 하나의 박스만 가지고 하려면???
//
//class AppleBox {
//	private Apple ap;
//	public void set(Apple a) { ap = a; }
//	
//	public Apple get() { return ap;}
//	
//}
//
//class OrangeBox {
//	private Orange or ;
//	public void set(Orange o) { or = o; }
//	
//	public Orange get() { return or;}
//	
//}
//

class Box {
	private Object ob;
	public void set(Object a) { ob = a; }
	
	public Object get() { return ob;}
	
}


public class FruitEx01 {
	
	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();
		
		aBox.set(new Apple());
		bBox.set(new Orange());
		
		Apple a =(Apple)aBox.get(); //  object 타입으로 받은 것을  apple타입으로 형변환!! ob를 a에게 전달
		
	}

}
