package com.ezen.ex1;

public class Ex_6_19_00 {
	
	public static String change(String str) { 
		return str +="456";  
	
//		System.out.println(str); //2 = ABC123456 
	}	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str); //1 = ABC123
		change(str);
		System.out.println(str); //3 = ABC123    ->  change를 벗어나면 메모리가 삭제되어 출력
		 
	}

}
