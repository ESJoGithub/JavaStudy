package 연습문제;

public class Ex0317_01_02 {
	
	public static void main(String [] args) {
		int[][] n = {{1},
					{1,2,3},
					{1},
					{1,2,3,4},
					{1,2}};
		for(int i=0; i < n.length; i++) {
			for(int j=0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}
// .length를 이용해서 정상적으로 출력하는 방식으로 코드 추가