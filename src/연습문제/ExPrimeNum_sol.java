package 연습문제;

import java.util.Scanner;

public class ExPrimeNum_sol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("서로 다른 양의 정수 두 개를 입력하시오: ");
		int n=scan.nextInt();
		int m = scan.nextInt();
		if(n > m) {           
			int x = m;
		    	m = n;
		    	n = x;	
		}		
		
		boolean[]pn = new boolean[m];
			for(int i=0; i<pn.length; i++) 
				pn[i] = true;
			pn[0] = pn[1] = false;
			
			int count = 0;
			for(int i=0; i<pn.length; i++) {
				if(pn[i]==true) {
					if(n < i)
					System.out.print(i + "\t");
					count++;
					if(count%10 == 0) 
						System.out.println();
					for(int j = i*2; j<pn.length; j+=i) {
						pn[j]=false;				
			}		
	scan.close();	
	}
}
}
}