package ex;

public class Array01 {

	public static void main(String[] args) {
		String[] name = new String[3]; //{"kim", "park", "yi"}
		
		name[0] = "kim";
		name[1] = "park";
		name[2] = "yi";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		System.out.println("------------------");
		String[] name0 ={"kim", "park", "kim"};
		
		System.out.println(name0[0]);
		System.out.println(name0[1]);
		System.out.println(name0[2]);
		System.out.println(name0[0]==name0[2]);
		
		System.out.println("------------------");
		
		String [] name2 = new String[3];
		name2[0] = new String("kim");
		name2[1] = new String("park");
		name2[2] = new String("kim");
		//System.out.println(name2[0]==name2[2]);
		System.out.println(name2[0].equals(name2[2]));
		
		String str = "201010-2234567";
		
		char ch = str.charAt(7);
		
		if(ch == '1')
			System.out.println("남");
		else if(ch == '2')
			System.out.println("여");
		
		System.out.println("----------------------");
		
		String str2 = "abcdef";
		String tmp = str2.substring(0, 5);
		
		System.out.println(tmp);
		System.out.println(tmp.length());
		
	}

}
