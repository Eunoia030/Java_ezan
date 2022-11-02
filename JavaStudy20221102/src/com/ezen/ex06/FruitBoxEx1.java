package com.ezen.ex06;

import java.util.ArrayList;

class Fruit {
	public String toSrirng() { return "Fruit";}
}
class Apple extends Fruit {
	public String toSrirng() { return "Apple";}
}
class Grape extends Fruit {
	public String toSrirng() { return "Grape";}
}
class Toy {
	public String toSrirng() { return "Yoy";}
}


public class FruitBoxEx1 {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		
		appleBox.add(new Apple());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
	}

}

class Box <T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
