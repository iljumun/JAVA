import java.io.IOException;

import javax.tools.JavaCompiler;


public class Test8 {

	public static void main(String[] args) throws IOException {
//		boolean choice = true;
//		if(choice == true) {
//			System.out.println("O.K");
//		} else {
//			System.out.println("Cancel");
//		}
//		int x = 10;
//		if(x < 20) {
//			System.out.println("x < 20");
//		}
//		int num = System.in.read();
//		System.out.println("num : " + num);
		
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("이름 :");
		String name = scan.nextLine();
//		System.out.println(name);
		
		if(name.equals("이순신")) { //String 타입은 equals로 비교
			System.out.println("이순신 장군님 입니다.");
		} else if(name.equals("홍길동")){
			System.out.println("홍길동 입니다.");
		}else {
			System.out.println("누구십니까?");
		}
	}
}
