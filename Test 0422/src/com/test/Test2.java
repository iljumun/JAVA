package com.test;
enum Menu{
	Pizza, Nuddle
}
enum Menu2{
	Pizza(100), Nuddle(200);
	int aa;
	private Menu2(int aa) { //Pizza형과 Nuddle형이 들어감
		this.aa = aa;
	}
}
public class Test2 {

	public static void main(String[] args) {
		Menu m = Menu.Pizza;
		System.out.println(m);
		System.out.println(Menu.valueOf("Pizza"));	
		System.out.println(Menu.valueOf("Pizza").ordinal());
		System.out.println(Menu2.valueOf("Pizza"));
		System.out.println(Menu2.valueOf("Pizza").aa);
	}

}
