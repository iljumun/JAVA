package com.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 2.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop02 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double cs = getUserInput();
        
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double jp = getUserInput();
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double math = getUserInput();
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double op = getUserInput();
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double sport = getUserInput();
        
        System.out.println( "==============================" );
        
        double sum = ((cs + jp + math + op + sport) / 5);
        System.out.println( "������" + sum + "�� �Դϴ�." );
        
        //���� �Ѱ�
        /*if ((sum >= 3.7) && (cs >= 2.5) && (jp >= 2.5 ) && (math >= 2.5) && (op >= 2.5) && (sport >= 2.5)) {
        System.out.println("���б��� ���� �� �ֽ��ϴ�.");	
        }  else {
        	System.out.println("���б��� ���� �� �����ϴ�.");
        }*/
       
        //������ �ڵ�
        boolean check1 = checkScore(cs);
        boolean check2 = checkScore(jp);
        boolean check3 = checkScore(math);
        boolean check4 = checkScore(op);
        boolean check5 = checkScore(sport);
        
        if (sum >= 3.7 && (check1 && check2 && check3 && check4 && check5)) {
        	System.out.println("���� ���б� ����� �Դϴ�.");
        } else {
        	System.out.println("���� ���б� ����ڰ� �ƴմϴ�.");
        }
        
    }
    //������ �ڵ�
    static boolean checkScore(double score) {
    	boolean flag = true;
    	if(score < 2.5) {
    		flag = false;
    	}
    	return flag;
    }
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}