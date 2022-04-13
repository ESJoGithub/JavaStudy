package 연습문제;

public class Ex0317_01_01 {
	
	public static void main(String[] args) {
		int[][] n = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i=0; i<5; i++) {
		 try {
			for(int j=0; j<4; j++) {
			System.out.print(n[i][j]+" ");
			}
		  }
		 catch(ArrayIndexOutOfBoundsException e){
			System.out.print("");
		 }
		 finally {
			 System.out.println("");
		 }
		}
	}
}
/* 처음 시도한 방법
 * try catch finally를 배운 직후라
 * i를 0~4 j를 0~3으로 설정하고 범위 밖이면 공백을 출력하도록 함
 */