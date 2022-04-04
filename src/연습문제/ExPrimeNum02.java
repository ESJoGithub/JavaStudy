package 연습문제;
	import java.util.Scanner;
	
public class ExPrimeNum02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 2개 입력하세요: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
						
		if(n > m) {           
			int x = m;
		    	m = n;
		    	n = x;	
		}		
//		int length = m-n+1;
//		int [] intArray = new int[length];
		
		for(int i=n; i<=m; i++) {
		 for(int j=2; j<i; j++) {
			 if(i%j==0) {
				 break;
			 }
			 else {
				 continue;
			 }
		 }
		}
		scan.close();
	}
}



