package com.ezen.ex03;


interface Printable {
	public void print(String doc);
}

class SprinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From samsung printer..");
		System.out.println(doc);
	}
}

class LprinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer..");
		System.out.println(doc);
	}
}


public class Printablelnterface {

	public static void main(String[] args) {
		
		String myDoc = "This is a report about .....";
		Printable prn = new SprinterDriver();
		System.out.println();
		
		prn = new LprinterDriver();
		prn.print(myDoc);
		
	}

}
