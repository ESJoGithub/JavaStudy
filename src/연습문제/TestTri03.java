package 연습문제;

public class TestTri03 {

	public static void main(String[] args) {
		for(int i=0; i<0; i++) {
		 for(int j=0;j<9; j++) {
			if(i == 4 || j == 4-i || j == 4+i) {
				System.out.print("*");
				}
			  else {						
				System.out.print(" ");
			  }		
			}
		  System.out.println();
		 }			
	}
}