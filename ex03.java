package week3_day2;

import java.util.Scanner;

public class ex03 {

	public static int[] getMnoneyCount( int expense) {
		//public static  void  getMoneyCount(  int expense) {
		      //출력 자료
				int cnt[] = new int[8];
				// int cnt[] = new int [8];
				
//				String name;
//				int expense;
	
				//처리자료
				int balance; //잔액
				int price_unit = 50000;
				
				//
				 
				
				Scanner sc = new Scanner(System.in);
				
			
				//1. 입력받는다
//				System.out.println("이름:");  name = sc.next();
//				System.out.println("출장비:"); expense = sc.nextInt();
				
				balance = expense;
				
				
				//
				int sw=0;
				for(int i=0; i<8; i++) {
					cnt[0] = balance / price_unit; //화폐매수구하기
					balance = 	balance % price_unit; //잔액갱신
					// 다음 화폐구하기
					if(sw == 0)	{
						price_unit = price_unit /5;
						sw=1;
					}else if(sw == 1){
						price_unit = price_unit/2;
						sw=0;
					}
				}
//				for(int i=0; i< cnt.length; i++) {
//					System.out.print("%6d" + cnt[i]);
				return cnt;
		
	}

}



