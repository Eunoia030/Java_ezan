package com.ezen.ex02;


interface Printable {
	public void print(String doc);
}

class Printer implements Printable {
	
	@Override
	public void print(String doc) {
	
		System.out.println(doc);
	}
}


public class Printablelnterface {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("Hello Java");
	}

}
