class Student2{
	public Student2() {  //�̸� �ʱ�ȭ(����Ʈ)��, ������
		System.out.println("Default Constructor");
		name = "������";
	}
	
	//String name; //Ŭ���� �������� ��ġ ���x
	private String name; //�����, set,get���� ����, �����ü� ����
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void gotoSchool() {
		System.out.println(name + "��(��) �б��� ����.");
	}
}
public class Test3 {

	public static void main(String[] args) {
		//1.
		Student2 std2 = new Student2();
		std2.setName("������");
		std2.gotoSchool();
		//2.
		Student2 std3;
		std3 = new Student2();
		std3.setName("�̼���");
		std3.gotoSchool();
		
		//3.
		/*execute(std2);*/
		Student2 t = execute(std2);
		t.gotoSchool();
		
	}
	/*static void execute(Student2 s) { //Student2 s = std2, �� �״�� ������
		s.gotoSchool();
	}*/
	static Student2 execute(Student2 s) { //Student2 s = std2, �� �״�� ������
		s.gotoSchool();
		return s;
	}
}