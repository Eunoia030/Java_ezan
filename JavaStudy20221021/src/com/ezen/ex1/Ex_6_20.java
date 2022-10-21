package com.ezen.ex1;



public class Ex_6_20 {
	
	static int [] shuffle(int [] dest) { //참조변수 [1~9]
		
		for(int i = 0; i<dest.length; i++) {
//			System.out.println(dest.length);
			int j = (int)(Math.random()*dest.length); //0~8
			int tmp = dest[i];
			dest[i] = dest [j];
			dest[j] = tmp;
			
			
		}
				
		return dest;
		
	}
	
	public static void main(String[] args) {
		
		
		int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int [] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
	
	
	
}
//static int[] shuffle(int [] original ) {
//	
//	int [] arr = original; 
//	
//	int tmp = 0;
//	int j =0;
//	
//	for (int i=0; i <arr.length; i++) {
//		j = (int)(Math.random()*9); 
//		tmp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = tmp;
//	}
//	return original;
//}
//
//
//public static void main(String[] args) {
//	int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//	System.out.println(java.util.Arrays.toString(original));
//	
//	int [] result = shuffle(original);
//	System.out.println(java.util.Arrays.toString(result));
//}
//}
