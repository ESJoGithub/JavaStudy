package 연습문제;

import java.util.Scanner;

public class ExSelectionSort_Grading02 {

	public static void main(String[] args) {

		int [] score1 = new int [10];     // 입력 받은 성적 배열 내림차순 정렬용
		int [] score2 = new int [10];     // 입력 받은 성적 배열
		String [] grade1 = {"A+", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
		String [] grade2 = new String [10];

		Scanner scan = new Scanner(System.in);
		System.out.print("학생 10명의 점수를 차례대로 입력하세요: ");
		
		for(int i=0; i<score1.length; i++) { // 성적들을 순차적으로 저장한다.
			score1[i] = scan.nextInt();
			score2[i] = score1[i];
		}	

		int temp = 0;
		for(int i=0; i<score1.length; i++ ) {     // score[0]부터 [9]까지 비교
			for(int j=i+1; j<score1.length; j++) {  // score[0]에 [0]부터 [9] 중 최대값 입력, score[1]에 [1]부터 [8] 중 최대값 입력... 반복
				if(score1[i] < score1[j]) {
					temp = score1[i];
					score1[i] = score1[j];
					score1[j] = temp;
				}
			}	
		}


		System.out.print("학생들의 성적은 다음과 같습니다: \t");
		for(int i=0; i<score2.length; i++ ) {     
			for(int j=0; j<score1.length; j++) {  
				if(score1[j]==score2[i]) {                
				   grade2[i] = grade1[j];
				}
			}
			// 오름차순 해둔 성적을 하나씩 보면서 오름차순 해두지 않은 성적과 동일하면 순서대로 A+부터 성적 부여
			System.out.print(grade2[i] + " ");
		}
		scan.close();
	}

}
