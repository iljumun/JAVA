/*
 * �л�
 * - �̸�, ����, Ű ....
 * - �����Ѵ�, ��������
 * 
 */
class Student {
	String name;
	int age;
	int height;
	void study() {System.out.println(name + "," + age + "," + height);};
	void gotohome() {};
}

/*
 * �б�
 *  - ��ġ, ����
 *  - �����Ѵ�.
 */
class School {
	String location;
	int qty;
	void teaching() {System.out.println("�б���ġ : " + location + "," + "����:" + qty );};
}

public class Test1 {
	
	public static void main(String[] args) {
		Student std = new Student(); //ù��° �л� (�ν��Ͻ�)
		std.name = "������";
		std.age = 27;
		std.height = 173;
		std.study();
		
		Student std2 = new Student(); //�ι�° �л� (�ν��Ͻ�)
		Student std3 = std; 
		
		School sho = new School();
		sho.location = "�Ȼ�� �ΰ";
		sho.qty = 500;
		sho.teaching();
		Test(std);
	}
	
	static void Test(Student s) {	// Student s = std;
		s.study();
		}
	
}