package com.test;
class MyClass{
	//int count; // Ŭ���� �������� ��� ������ ����
	static int count;  //���������� ī��Ʈ ��� ����
	public MyClass() {
		count++;
		System.out.println(count);
	}
}
public class Test8 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyClass mc2 = new MyClass();
		MyClass.count = 100;
	}

}