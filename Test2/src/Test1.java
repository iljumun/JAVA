// Instance variable (�������� ���)
// static variable �޸𸮿� �̸� ������־ �ٷ� ��� ����
class A{
	int data = 50; // Instance variable 
	static int m = 100; // static variable 
	//�Լ�
	void method() {
		int n = 90; // local variable
	}
}

class Student{
	String name;
	int age;
	void goSchool() {
		System.out.println(name + age + "��" + "�б��� ����.");
	}
}

public class Test1 {
	// Local variable  �޼���(�Լ�) ���� �������� ���ú���
	public static void main(String[] args) {
		Student stu = new Student(); //�ν��Ͻ� ��� ���
		stu.name = "�̼���";
		stu.age = 20;
		stu.goSchool(); // �޸𸮿��� ����
		
		System.out.println(A.m);
		A.m = 200;
		System.out.println(A.m);
		A a = new A();
		System.out.println(a.data);
		
		String str = "1234";
		int a1 = Integer.parseInt(str);
		Integer a2 = new Integer(a1); // Wrapper class
		String str2 = a2.toString(); // look up
		
	}

}