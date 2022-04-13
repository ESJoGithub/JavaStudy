package 연습문제;

import java.util.Arrays;

// Ex0317_05 2차원 배열로 풀어보기 시도 220413 재도전
public class Ex0317_05_02 {

	public static void main(String[] args) {
		int [][] array = new int [4][4];

		int i = 0;
		int j = 0;		

		// 이번엔 반대로 모든 배열에 랜덤한 수를 다 넣어본다.
		for(i=0; i<array.length; i++) {
			for(j=0; j<array[i].length; j++) {				
				array[i][j] = (int)(Math.random()*10+1);
			}
		} 
		

		// 임의의 6자리에 0 넣기
		int count = 1;       // 무한반복 방지 + 여섯 자리 계산용
		while(count <=6) {   // 0이 6자리 찰 때까지 반복
			i = (int)((Math.random()*4+1)-1); 
			j = (int)((Math.random()*4+1)-1);
			// 임의의 배열 선정. i와 j 범위는 0~3인데 Math.random()은 1부터 범위를 구하니까 1~4까지 구해서 1씩 뺀다.
			if(array[i][j] != 0) {
				array[i][j] = 0;
				count++;
			} // array[i][j]가 0이 아닐 때만 동작			
		}
		
		
		// for-each문으로 출력해보기
		for(int m[] : array) { 
			for(int n : m) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}		
	}
}