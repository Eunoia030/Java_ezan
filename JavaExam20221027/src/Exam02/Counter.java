package Exam02;

import java.util.Arrays;

public class Counter {
	public static void main(String[] args) {
	
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Computer());

		b.summary();
		
	}
}

class Product {
	int price; // 제품의 가격
	Product(int price) {
	this.price = price;
	}
}
class Tv extends Product {
	Tv() { super(1000000); }
	public String toString() { return "Tv"; }
}
class Computer extends Product {
	Computer() { super(3000000); }
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(600000); }
	public String toString() { return "Audio"; }
}


class Buyer{
	int money = 22222222;
	int origMoney = money;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(p.price > money) {
		 System.out.println("금액 부족하여"+ p+"을/를 살수 없습니다.");
		return;
		}
		else
			money -= p.price;
			add(p);
	}
	
	void add(Product p) {
		try {
			cart[i] = p;
			i++;
		}catch(ArrayIndexOutOfBoundsException e) {
			Product[] nCart = new Product[cart.length*2];
			for (int j = 0; j < cart.length; j++){
				 nCart[j] = cart[j];
			}
			nCart[i] = p;
			cart = nCart;
			i++;
		}
	}
	
	void summary() {
		System.out.print("구입목록: ");
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			else
				System.out.print(cart[i]+", ");
		}
		System.out.println();
		System.out.println("사용금액: "+(origMoney-money));
		System.out.println("남은금액: "+money);
		}
}
