// method, function, procedure
//   메소드,     함수,       프로시져
public class Test10 {
	static int add(int a, int b) {  // 
		int z = a + b;
		return z;
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = a + b;
		
		int a1 = 2;
		int b1 = 3;
		int c1 = a1 + b1;
		
		int c2 = add(1,2);
		System.out.println(c2);
	}

}
