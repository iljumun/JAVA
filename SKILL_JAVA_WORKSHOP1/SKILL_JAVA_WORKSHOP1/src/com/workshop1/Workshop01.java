package com.workshop1;

import java.util.Scanner;

// ���� 1.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop01 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int i = getUserInput();
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int il = getUserInput();
        
        
        System.out.print( " ���̱� �ֹ� ���� : " );
        int b = getUserInput();
        
        
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int c = getUserInput();
        
        System.out.println("========= �ݾ� ==========");
        System.out.println("�Ƹ޸�ī�� �ֹ� ���� : " + i);
        System.out.println("ī��� �ֹ� ���� : " + il);
        System.out.println("���̱� �ֹ� ���� : " + b);
        System.out.println("ũ��ġ�� �ֹ� ���� : " + c);
        
        int sum = function(i, il, b, c);
        System.out.println("�� ���� �ݾ���" + sum + "�� �Դϴ�");
        
        double point = 0;
        if ((sum >= 12000) && sum < 30000) {
        	point = sum * 0.01;
        	System.out.println("���� �ݾ��� " + point + "�� �Դϴ�." );
        	
        } else if (sum >= 30000) {
        	point = sum * 0.02; 
        	System.out.println("���� �ݾ���" + point + "�� �Դϴ�.");
        	
        	} else {
        		System.out.println("�������� " + point + "�� �Դϴ�.");
        	}
        }
        
        
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
    public static int function(int i, int il, int b, int c) {
    	int sum = (i * 2000) + (il * 3000) + (b * 1500) + (c * 500);
    	return sum;
    }
}