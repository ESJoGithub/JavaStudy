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