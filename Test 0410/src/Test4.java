class Student3{
	public Student3(){ //�����ڴ� Ŭ���� �̸��̶� ���ƾ���
		System.out.println("Default Constructor"); //Ȯ�ο�
		name = "ȫ�浿";
		age = 20;
	}
	public Student3(String nm, int ag) { // ������ ���� 2��
		System.out.println("Default Constructor2");
		name = nm;
		age = ag;
	}
	//OverLoading �޼ҵ� �̸��� �����鼭 ���� ������ �޶󵵴�
	private String name;
	private int age;
	
	public void setName(String nm) {
		name = nm;
	}
	public void setName(String nm, int ag) {
		name = nm;
		age = ag;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public void gotoSchool() {
		System.out.println(name + ", " + age  + "�� �б��� ����.");
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.gotoSchool();
		
		Student3 stu2 = new Student3("������", 20);
		stu2.gotoSchool();
	}

}