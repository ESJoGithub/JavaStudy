package 연습문제;

import java.util.Scanner;

public class ExSelectionSort_Grading01 {

	public static void main(String[] args) {

		int [] score1 = new int [10];     // 입력 받은 성적 배열 오름차순 정렬용
		int [] score2 = new int [10];     // 입력 받은 성적 배열
		String [] grade1 = {"A+", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};

		Scanner scan = new Scanner(System.in);
		System.out.print("학생 10명의 점수를 차례대로 입력하세요: ");
		String s = scan.nextLine();       // 문자열로 입력받아서

		String grade2[] = s.split(" ");   // 공백으로 나눈다.

		for(int i=0; i<grade2.length; i++) {
			score1[i] = Integer.parseInt(grade2[i]);
			score2[i] = Integer.parseInt(grade2[i]);
		}	
		// 공백으로 나눈 성적들을 정수로 변환해준다.

		int temp = 0;
		for(int i=0; i<score1.length; i++ ) {     // score[0]부터 [9]까지 비교
			for(int j=i; j<score1.length; j++) {  // score[0]에 [0]부터 [9] 중 최대값 입력, score[1]부터... 반복
				if(score1[i] < score1[j]) {
					temp = score1[i];
					score1[i] = score1[j];
					score1[j] = temp;
				}
				else{
					continue;
				}
			}		
		}


		System.out.print("학생들의 성적은 다음과 같습니다: \t");
		for(int i=0; i<score2.length; i++ ) {     
			for(int j=0; j<score1.length; j++) {  
				if(score1[j]==score2[i]) {         // 비교는 정수형 배열끼리
					grade2[i]=grade1[j];           // 성적 변환은 문자열 배열끼리
				}
			}
			// 오름차순 해둔 성적을 하나씩 보면서 오름차순 해두지 않은 성적과 동일하면 순서대로 A+부터 성적 부여
			System.out.print(grade2[i] + " ");
		}
		scan.close();
	}

}
