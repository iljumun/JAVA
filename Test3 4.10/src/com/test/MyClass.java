package com.test;
// public, default
public class MyClass {
//public, private, protected, default
	public int a; // 다사용가능
	private int b; //클래스 내부에서만  사용
	protected int c;
	int d; //패키지 안에서만 사용
	public void aMethod() {}
	private void bMethod() {}
	protected void cMethod() {}
	void dMethod() {}
}
