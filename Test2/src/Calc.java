//공용 라이브러리 클래스
public class Calc {
	public int add(int a, int b) {
			return a + b;
	}
	private int subtract(int a, int b) { //외부에서 접근 x
		return a - b;
	}
	public static int add2(int a, int b) {
		return a + b;
	}
	public static int subtract2(int a, int b) {
		return a - b;
	}
}
