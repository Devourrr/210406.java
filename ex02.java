package week3_day2;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��� �ڷ�
		int cnt[] = new int[8];
		// int cnt[] = new int [8];
		
		String name;
		int expense;
		//ó���ڷ�
		int balance; //�ܾ�
		int price_unit = 50000;
		
		//
		 
		
		Scanner sc = new Scanner(System.in);
		
	
		//1. �Է¹޴´�
		System.out.println("�̸�:");  name = sc.next();
		System.out.println("�����:"); expense = sc.nextInt();
		
		balance = expense;
		balance = 243120;
		
		//
		int sw=0;
		for(int i=0; i<8; i++) {
			cnt[0] = balance / price_unit; //ȭ��ż����ϱ�
			balance = 	balance % price_unit; //�ܾװ���
			// ���� ȭ���ϱ�
			if(sw == 0)	{
				price_unit = price_unit /5;
				sw=1;
			}else if(sw == 1){
				price_unit = price_unit/2;
				sw=0;
			}
		}

		for(int i=0; i< cnt.length; i++) {
			System.out.print("%6d" + cnt[i]);
		}
	}

}
