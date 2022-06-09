package day0519;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		//숫자를 입력받아서
		//그 숫자가 소수인지 아닌지를 판단하는 코드
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int count = 1;
		
		for(int i=2; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
			
//			if(num == i) {
//				System.out.println(num + "은 소수");
//			} else if(num % i == 0) {
//				System.out.println(num + "은 소수 아님");
//			}
		}
		
		if(count == 2) {
			System.out.println("소수");
		} else {
			System.out.println("소수 아님");
		}

	}

}
