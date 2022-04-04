package 연습문제;

import java.util.Scanner;

public class TestTri04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("자연수를 입력하시오.>>");
			int n = scan.nextInt();
	
		for(int i=0; i<n; i++) {
		 for(int j=0;j<2*n; j++) {
			if(i == n-1 || j == n-i || j == n+i) {
				System.out.print("*");
				}
			  else {						
				System.out.print(" ");
			  }		
			}
		  System.out.println();
		 }			
		scan.close();
	}
}