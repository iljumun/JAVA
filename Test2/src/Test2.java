class Employee{
	static String �б�;
	String name;
	int age;
	void gotWork() {
		System.out.println(name + ", " + age  
			+ "�� �� ����� �����Ѵ�" );
	}
}

public class Test2 {
	public static void main(String[] args) {
		// value-type(�� Ÿ��) vs reference-type(���� Ÿ��)
		// JVM
		// stack, heap
		
		int a = 1;
		int b = a;
		
		Employee emp = new Employee();
		emp.age = 27;
		emp.name = "������";
		emp.gotWork();
		Employee.�б� = "�����";
		System.out.println(Employee.�б�);
		Employee emp2 = emp;  //emp �Է°� �״�� ������
		emp2.gotWork();
		Employee emp3 = new Employee(); // �ٽ� ����
		emp3.gotWork();
	}
}