package Exam;

public class Exercise {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();		// 객체 생성
		b.buy(new Tv());			// 생성된 객체 b Tv 호출
		b.buy(new Computer());		// 생성된 객체 b computer 호출
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];	//구입한 제품을 저장하기 위한 배열
	int i = 0;	//Product배열 cart에 사용될 index
	void buy (Product p) {
		/*
		(1) 아래의 로직에 맞게 코드를 작성하시오.
		1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
		1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
		1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
		Java의 정석定石 3판 - 연습문제 풀이 57
		*/
		if (money < p.price) {				// 소지금액이 구매금액보다 적을때
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");	// 출력	// p = Product
			return;		
		}
		 money -= p.price;	// 소지금액에 구매할 제품을 뺌
		 add(p);	// 구매한 제품을 메소드 add 호출하여 정보를 저장한다. 
	}
	
	void add(Product p) {
		/*
		(2) 아래의 로직에 맞게 코드를 작성하시오.
		1.1 i의 값이 장바구니의 크기보다 같거나 크면
		1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
		1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
		1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
		1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		*/


		 if(i >= cart.length){ 	

			 Product[] temp = new Product[cart.length*2];	// 새로운 2개 큰 배열 생성
			 
			for( int j = 0; j < cart.length; j++) {	// 기존 장바구니의 내용에 새로운 장바구니 내용을 복사 
				 
				 temp[j] = cart[j];
			 }
			 
			 cart = temp;

		 }

		 cart[i++] = p;	// 장바구니(cart)에 저장 -> i의 값을 1 증가 
		 
		 }
		// add(Product p)
	
	void summary() {
		/*
		(3) 아래의 로직에 맞게 코드를 작성하시오.
		1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
		1.3 물건을 사고 남은 금액(money)를 출력한다.
		*/
		String list = "";
		
		int sum = 0;	
		
		for(int j = 0; j < i; j++) {
			sum += cart[j].price;	// 구매할때마다 구매금액 호출하여 + 업데이트
			list += (j==0)? ""+cart[j].toString():", "+cart[j].toString();		
			// 구매할때마다 리스트 업데이트  toString();을 두개나 쓰는 이유는 ? 업데이트 되는 구매목록 뒤에 ","를  붙이고 마지막 구매에는 붙이지 않기 위해서이다. 
		}

		 System.out.println("구매물품 : " + list );
		 
		 System.out.println("사용한 금액 : " + sum );

		 System.out.println("남은 금액 : " + money );
	 // summary()
	}
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {

	Tv() { super(100); }
	
	public String toString() { return "Tv"; }

}



class Computer extends Product {
	
	Computer() { super(200); }
	
	public String toString() { return "Computer";}

}


class Audio extends Product {

	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
		
}








