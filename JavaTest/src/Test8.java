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
		System.out.println("�̸� :");
		String name = scan.nextLine();
//		System.out.println(name);
		
		if(name.equals("�̼���")) { //String Ÿ���� equals�� ��
			System.out.println("�̼��� �屺�� �Դϴ�.");
		} else if(name.equals("ȫ�浿")){
			System.out.println("ȫ�浿 �Դϴ�.");
		}else {
			System.out.println("�����ʴϱ�?");
		}
	}
}