package ex;

public class Exercise6_2 { 
	public static void main(String args[]) { 
	
		SutdaCard card1 = new SutdaCard(3, false);//생성자 인자값을 2개 받는 생성자를 요규..
		SutdaCard card2 = new SutdaCard();// 디폴트생성자
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	} 
}

class SutdaCard { 
	int num;
	boolean isKwang;


  SutdaCard (int n, boolean f){
	  num = n;
	  isKwang = f;
	  
  }
  SutdaCard(){
	  num =1;
	  isKwang = true;
  }
  
  String info() {
	  return num + ((isKwang)?"K":"");
	  
  }
}
