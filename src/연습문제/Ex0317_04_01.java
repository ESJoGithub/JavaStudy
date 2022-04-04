package 연습문제;
	import java.util.Scanner;

public class Ex0317_04_01 {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개? ");
			int n = scan.nextInt();	
			int[] array = new int[n];

		for(int i=0; i<array.length; i++) {
		  array[i] = (int)(Math.random()*100+1);
			System.out.print(array[i]+" ");
			
			if(i%10==9) {
				System.out.println();
			}
		}
		scan.close();	
	}
}
