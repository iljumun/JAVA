class Employee{
	static String 학교;
	String name;
	int age;
	void gotWork() {
		System.out.println(name + ", " + age  
			+ "세 인 사람이 일을한다" );
	}
}

public class Test2 {
	public static void main(String[] args) {
		// value-type(값 타입) vs reference-type(참조 타입)
		// JVM
		// stack, heap
		
		int a = 1;
		int b = a;
		
		Employee emp = new Employee();
		emp.age = 27;
		emp.name = "문일주";
		emp.gotWork();
		Employee.학교 = "갓기대";
		System.out.println(Employee.학교);
		Employee emp2 = emp;  //emp 입력값 그대로 가져옴
		emp2.gotWork();
		Employee emp3 = new Employee(); // 다시 생성
		emp3.gotWork();
	}
}
