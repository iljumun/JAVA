package com.test;
class A{
	void aMethod() {
		System.out.println("aMethod");
	}
}
class B extends A{
	void bMethod() {
		System.out.println("bMethod");
	}
}
public class Test1 {

	public static void main(String[] args) {
		B b = new B();
		String className = b.getClass().getSimpleName(); //Ŭ���� �̸� Ȯ��
		System.out.println(className);
		if(className.equals("B")) {
			System.out.println("B O.K");
		}
		if(b instanceof B) {  //���������� �����ϴ� �ν��Ͻ��� Ŭ������ ����ϴ� Ŭ������ ���� ������
			System.out.println("B O.K2");
		}
		boolean check1 = b instanceof A;
		System.out.println(check1);
		B b1 = null;
		boolean check2 = b1 instanceof A;
		System.out.println(check2);
	}

}