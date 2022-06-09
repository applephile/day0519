package day0519;

import java.util.Scanner;

public class 반복문2 {

	public static void main(String[] args) {
		
		//while문과 Scanner를 이용하여 입력된 데이터로
		//예금, 출금, 조회, 종료 기능 제공하는 코드 작성
		
		Scanner s = new Scanner(System.in);
		
		int result = 0;
		boolean run = true;
		
		bank : while(run) {
		
			System.out.println("------------------------------");
			System.out.printf("1.예금 | 2.출금 | 3.조회 | 4.종료\n");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			int num = s.nextInt();
			
//			if(num == 1) {
//				System.out.print("예금액> ");
//				result += s.nextInt();
//			} else if(num == 2) {
//				System.out.print("출금> ");
//				result -= s.nextInt();
//			} else if(num == 3) {
//				System.out.print("조회> ");
//				System.out.println(result);
//			} else if(num == 4) {
//				System.out.println("\n프로그램 종료");
//				break bank;
//			}
			
			switch (num) {
			case 1:
				System.out.print("예금액> ");
				result += s.nextInt();
				break;
			case 2:
				System.out.print("출금> ");
				result -= s.nextInt();
				break;
			case 3:
				System.out.print("조회> ");
				System.out.println(result);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("\n프로그램 종료");
			
	}

}
