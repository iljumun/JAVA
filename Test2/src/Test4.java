
public class Test4 {
	public static void main(String[] args) {
		int number = 10;
		switch (number) {
		case 10:
			System.out.println("10");
			break; //조건 달성하면 스땁
		case 20:
			System.out.println("20");
			break;
		default :
			System.out.println("another");
		}
		
		if(number == 10) {
			System.out.println("10");
		} else if(number == 20) {
			System.out.println("20");
		} else {
			System.out.println("another");
		}
	}
}
