package com.ezen.ex0;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손이다.");
		
		if (f instanceof Fightable)
			System.out.println("f는 Fightable클래스의 자손이다.");
		
		if (f instanceof Movable)
			System.out.println("f는 movable클래스의 자손이다.");
		
		if (f instanceof Attackable)
			System.out.println("f는 Attackable클래스의 자손이다.");
		
		if (f instanceof Object)
			System.out.println("f는 Object클래스의 자손이다.");
				
	}
}





class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {/*내용 생략*/}
	public void attack(Unit u) {/*내용 생략*/}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable { void move (int x, int y);}
interface Attackable { void attack(Unit u);}
