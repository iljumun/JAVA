package com.test;
class Animal2 {
	void move() {System.out.println("Animal move");}
}
class Dog2 extends Animal2{
	void move() {System.out.println("Dog move");}
}
class Cat2 extends Animal2{
	void move() {System.out.println("Cat move");}
}
public class Test13 {
	public static void main(String[] args) {
		Animal2 a = new Animal2();
		a.move();
		Dog2 d = new Dog2();
		d.move();
		Cat2 c = new Cat2();
		c.move();
	}

}
