//�޼��� �������̵� (�޼��� �̸� ���Ƶ� ���� ���� ������ �ٸ��� �ߺ� ����)

package com.test;
class Calculator{
	int result;
	
	public Calculator() { //result�� 0���� �ʱ�ȭ ��Ű�� ������ 
		result = 0;
	}
	public Calculator(int r) { // �Է°� ������ �� ȣ��
		result = r;
	}
	int add(int a, int b) {  //���� ����
		 int result = a + b;
		 return result;
	}
	int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	

}
public class Test3 {

	public static void main(String[] args) { //���� ����
		Calculator ca = new Calculator();
		int c = ca.add(1, 2);
		System.out.println(c);
		int a = 1;
		int b = 2;
		int result = ca.add(a, b);
		System.out.println(result);
		int d = ca.subtract(5, 1);
		System.out.println(d);
		
		Calculator ca2 = new Calculator(100);
		int i = ca2.result;
		System.out.println(ca2.result);
		int j = ca.add(i, 20);
		System.out.println(j);
		
	}

}