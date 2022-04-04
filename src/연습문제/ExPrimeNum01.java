package 연습문제;
	import java.util.Scanner;
	
public class ExPrimeNum01 {

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
		if(n>=2&&m>=2) {
		 for(int i = n; i <= m; i++) {
			 for(int j = 2; n > j; j++) {
				if(i%j==0) {
					i++;
					continue;
				}
				else
				 System.out.print(i+"%"+j+" ");

			/*	if(n%j==0) 
					continue;
				else if(n%j!=0||n==j)
					System.out.print(i + ", ");			*/
			}
			 continue;
		 }
		}
			scan.close();
	 }
}
