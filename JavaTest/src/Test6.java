
public class Test6 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		boolean c = (a==b);
		System.out.println(c);
		System.out.println("(a != b) : "  + (a != b));
		boolean e = false;
		boolean f = true;
		boolean g = e && f; //and 둘다 같아야 true
		boolean g2 = e || f; //or 둘중 하나 맞으면 true
		System.out.println(g);
		System.out.println(g2);
		boolean g3 = !(e && f);
		System.out.println(g3);
		boolean g4 = (e && f) || !(e);
		System.out.println(g4);
	}

}
