package day0519;

public class Array5 {

	public static void main(String[] args) {
		
		//성적 입력, 국영수 순서
		int[][] score = {
						{100, 100, 100}, 
						{60, 80, 40},
						{80, 85, 90},
						{60, 65, 70},
						{50, 55, 60},
		};
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("==============================================\n");
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("%2d\t", i + 1);
			
			int sum = 0;
			float avg = 0.0f;
			
			//과목별 합계 다른 방법
//			kor += score[i][0];
//			eng += score[i][1];
//			math += score[i][2];
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				
				System.out.printf("%d\t", score[i][j]);
				
				if(j == 0) {
					kor += score[i][j];
				} else if(j == 1) {
					eng += score[i][j];
				} else if(j == 2) {
					math += score[i][j];
				}
				
			}
			avg = sum / score[i].length;
			
			System.out.printf("%d\t%.1f\n", sum, avg);
		}
		System.out.printf("==============================================\n");
		System.out.printf("총점\t%d\t%d\t%d\t", kor, eng, math);
	}

}
