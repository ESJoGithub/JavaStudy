package 연습문제;
	import java.util.Scanner;

public class Ex0317_04_02 {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개? ");
			int n = scan.nextInt();	
			int[] array = new int[n];

		for(int i=0; i<n; i++) {
		  array[i] = (int)(Math.random()*100+1);
		  for(int j=1; j<=i; j++) {
		  	while(i>0 && array[i] == array[i-j]) {
		  		array[i] = (int)(Math.random()*100+1);
		  	}	
		  }
			System.out.print(array[i]+" ");
			
			if(i%10==9) {
				System.out.println();
			}
		}
		scan.close();	
	}
}