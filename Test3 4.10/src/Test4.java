class Student3{
	public Student3(){ //생성자는 클래스 이름이랑 같아야함
		System.out.println("Default Constructor"); //확인용
		name = "홍길동";
		age = 20;
	}
	public Student3(String nm, int ag) { // 생성자 변수 2개
		System.out.println("Default Constructor2");
		name = nm;
		age = ag;
	}
	//OverLoading 메소드 이름은 같으면서 변수 개수가 달라도댐
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
		System.out.println(name + ", " + age  + "가 학교에 간다.");
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.gotoSchool();
		
		Student3 stu2 = new Student3("강감찬", 20);
		stu2.gotoSchool();
	}

}
