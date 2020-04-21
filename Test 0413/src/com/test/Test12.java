package com.test;
class A2 {
	void aMethod() {System.out.println("aMethod");}
}
class B2  extends A2{
	void bMethod() {System.out.println("bMethod");}
	void aMethod() {System.out.println("aMethod on B2 Class");}
}
class C2 extends A2{
	void cMethod() {System.out.println("cMethod");}
	void aMethod() {System.out.println("aMethod on C2 Class");}
}

public class Test12 {
	static void callMethod(B2 b) {
		b.aMethod();
	}
	static void callMethod(C2 c) {
		c.aMethod();
	}
	static void callMethod2(A2 a) {
		a.aMethod();
	}
	public static void main(String[] args) {
		callMethod(new B2());
		callMethod(new C2());
		callMethod2(new B2());
		callMethod2(new C2());
		/*B2 b = new B2();
		b.aMethod();
		b.bMethod();
		
		A2 a = b;
		a.aMethod();
		//a.bMethod(); Ÿ���� �ٲ㼭 b�޼ҵ�� ����
		
		B2 c = (B2)a; //������ ����ȯ
		c.aMethod();
		c.bMethod();
		
		A2 a1 = new B2(); //�̷��� ���̾�
		a1.aMethod();
		
		C2 c2 = new C2();
		c2.aMethod();
		c2.cMethod();*/
		
		/*B2 b2 = new B2();
		b2.bMethod();
		A2 a2 = b2;
		a2.aMethod();*/
		
	}

}