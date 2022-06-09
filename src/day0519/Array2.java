package day0519;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		//배열 합계, 평균
		
		int[] scores = {95, 83, 62};
		
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println(sum);

		float avg = sum / scores.length;
		
		System.out.println(avg);
		
		System.out.println("--------------------------");
		
		//scores2의 배열값 중에서
		//최대값과 최소값 출력
		
		int[] scores2 = {13, 5, 16, 6, 8, 29};
		int max = scores2[0];
		int min = scores2[0];
		
		for(int i=1; i<scores2.length; i++) {
			
			if(scores2[i] > max) {
				max = scores2[i];
			} else if(scores2[i] < min) {
				min = scores2[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("--------------------------");
		
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(Arrays.toString(numArr));
		
		//숫자의 순서를 섞어서 출력
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random() * 10);
			int temp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = temp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}
}

