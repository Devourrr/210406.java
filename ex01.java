package week3_day2;

import java.util.Scanner;

public class ex01 {

	
	
	// ȭ��
	
	// �̸�, ����� => 8�� ȭ��ż� ���ϱ�
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//����ڷ�
		int cnt_50000=0;
		int cnt_10000=0;
		int cnt_5000=0;
		int cnt_1000=0;
		int cnt_500=0;
		int cnt_100=0;
		int cnt_50;
		int cnt_10;
		
		//�Է�
		String name;
		int expense;
		
		//
		int balance; //�ܾ�
		int price_unit = 50000;
		
		Scanner sc = new Scanner(System.in);
		//balance 243120
		name = sc.next();
		expense = sc.nextInt();
		
		balance = expense;
		cnt_50000 = balance / 50000; //4
		
		balance = balance % 50000; //���ο� �ܾ� 43120
		cnt_10000 = balance /  10000; //4
		
		balance = balance % 10000; //3120
		cnt_5000= balance/ 5000; //0��
		
		balance = balance % 5000;
		cnt_1000= balance / 1000; //3��
		
		balance = balance % 1000; //120
		cnt_500 = balance / 500; // 0��
		
		balance = balance % 500;
		cnt_100 = balance / 100; //1��
		
		balance = balance % 100; // 20
		cnt_50 = balance / 50; //0��
		
		balance = balance % 50; // 20
		cnt_10 = balance / 10; // 2��
		
		System.out.println( name + "50000��"+ expense);
		System.out.printf("50000����" +"%6d", cnt_50000);
		System.out.printf("\t" + "10000����" +"%6d", cnt_10000);
		System.out.printf("\t" + "5000����" +"%6d", cnt_5000);
		System.out.printf("\t" + "1000����" + "%6d", cnt_1000);
		System.out.printf("\t" + "500����" + "%6d", cnt_500);
		System.out.printf("\t" + "100����" + "%6d", cnt_100);
		System.out.printf("\t" + "50����" + "%6d", cnt_50);
		System.out.printf("\t" + "10����" + "%6d", cnt_10);
		
		
	}

}
