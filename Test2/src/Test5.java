
public class Test5 {
	public static void main(String[] args) {
		int a = 1;
		while(a < 10) {
			System.out.println(a);
			a++; // a = a+1
		}
		System.out.println("----------------------------");
		a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a < 10);
		System.out.println("-----------------------------");
		
	for(int a2 = 1; a2 < 10; a2++) { // a2�� for ���������� ���
		System.out.println(a2);
	}
		
	System.out.println("-----------------------");
	
	// 1~10���� ��\
	
	int sum=0;
		for(int a3 = 1; a3 <= 10; a3++) {
				//sum = sum + a3;
				sum += a3;
		}
			System.out.println(sum);
	
	int sum2 =0;
	int b=1;
		while(b <= 10) {
			//sum2 = sum2 +b;
			sum2 += b;
			System.out.println("sum :" + sum + ", b :" + b);
			b++;
		}
			System.out.println(sum);

	}
	}
