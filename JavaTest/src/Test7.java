
public class Test7 {
	public static void main(String[] args) {
//		int a = 1;
//		System.out.println(a);
//		int b = a++;
//		System.out.println(b);  //b는 증가 x 아직 1임
//		System.out.println(a);  //a를 호출했을때 증가
//		//System.out.println(b);
		
//		int a1 = 1;
//		System.out.println(a1);
//		int b1 = ++a1;      //증가해서 b1으로 들어감
//		System.out.println(b1);
//		System.out.println(a1);
		
		int d = 25;
		System.out.println(d++); //증가한 상태
		//System.out.println(d); 이때 26
		System.out.println(++d);// 다시한번 증가해서 출력 이때는 바로 더해줌
		
		for(int s = 1; s <= 10; s++) {
			System.out.println(s);
		}

	}
}
