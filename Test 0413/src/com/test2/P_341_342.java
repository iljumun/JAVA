package com.test2;

class Cake{
	public int size; // ����ũ ������
	public Cake(int sz) {
		size = sz;
	}
	public void showCakeSize() {
		System.out.println();
		System.out.println("Bread ounces : " + size);  //�������̵� �Ǹ� ���� Ŭ������ �޼���� �������.
	}
}

class CheeseCake extends Cake {
	public int size; // ġ������ũ ������
	public CheeseCake(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}
	public void showCakeSize() {
		// super.size�� ���� Ŭ������ ��� size�� �ǹ���
		System.out.println("Bread Ounces : " + super.size);
		// size�� �� Ŭ���� CheeseCake�� ��� size�� �ǹ�
		System.out.println("Cheese Ounces : " + size);
	}
}

public class P_341_342 {
	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake(5, 7);
		Cake ca2 = ca1;
		
		//ca2�� Cake ���� �̹Ƿ� ca2.size�� Cake�� ��� size�� �ǹ���
		System.out.println("Bread Ounces : " + ca2.size);
		
		//ca1�� CheeseCake �����̹Ƿ� ca1.size�� CheeseCake�� ��� size�� �ǹ���
		System.out.println("Cheese Ounces : " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}

}