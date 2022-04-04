package 연습문제;
	import java.util.Scanner;
	
public class ExPrimeNum03 {

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
		int [][]prime = new int[n][n-3];			
		
		for(int i=0; i<prime.length; i++) {  
			for(int j=2; j<prime[i].length; j++) 
				prime[i] = new int[j];
//				prime[i] = i;
			System.out.print(i);					
			}		
		scan.close();
	}
}



