package com.test;
class Box3<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class P_495 {
	public static void main(String[] args) {
		Box3<String> sBox = new Box3<String>();  // Box�� ��Ʈ�� ���¿�?
		sBox.set("I am so happy");
		
		Box3<Box3<String>> wBox = new Box3<>(); // box3�� box3�� �����ؼ� ��Ʈ�������� ��ä�� ���� , �׷��� �ؿ� �ּҰ��� ����
		wBox.set(sBox);
		
		Box3<Box3<Box3<String>>> zBox = new Box3<>();
		zBox.set(wBox);
		System.out.println(zBox.get().get().get());
		System.out.println(sBox.get());
		System.out.println(wBox.get());  //�ּҰ�
		System.out.println(zBox.get());  //�ּҰ�
	}

}