package com.ezen.ex03;

//inner class(이너 클래스)

class Outer {
	private static int num=0;
	
	static class Nested1 {
		void add( int n ) {
			num += n;
		}
	}
	
	static class Nested2 {
		int get() { return num;}
	}
	
}

public class StaicNested {
	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(5);
		
		Outer.Nested2 nst2 =new Outer.Nested2();
		System.out.println(nst2.get());
		
		
	}
}