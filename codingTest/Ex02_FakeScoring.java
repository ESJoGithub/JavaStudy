package codingTest;

import java.util.Scanner;

public class Ex02_FakeScoring {

	public static void main(String[]  args) { 

		Scanner scan = new Scanner(System.in); 
		
		int [] score; 
		int n = 0; 
		int m = 0; 
		float sum = 0; 

		System.out.println("시험 본 과목의 개수를 입력해주세요(1~1000): "); 
		n = scan.nextInt(); 
		score = new int[n]; 

		System.out.println("과목별 시험 성적을 띄어쓰기로 구분하여 입력해주세요: "); 

		for(int i = 0; i < score.length; i++) { 
			score[i] = scan.nextInt(); 
			sum += score[i]; 
			if(i > 0 && score[i] > score[i-1]) { 
				m = score[i]; 
			} 
		} 
		System.out.println((double)sum/m*100/n);	 
		scan.close();
	} 

}
