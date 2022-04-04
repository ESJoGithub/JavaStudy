package 연습문제;

public class TestQuad02 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
		 for(int j=1;j<=10; j++) {
			if(((i >=2)&&(i<=4))&&((j>=2)&&(j<=9))) {
				System.out.print(" ");
			}
			else {		
				System.out.print("*");
	        }
		 }
		 System.out.println();
		}
	 }			
}