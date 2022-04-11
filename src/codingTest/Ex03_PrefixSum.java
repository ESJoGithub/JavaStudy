package codingTest;

import java.util.Scanner;

public class Ex03_PrefixSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = 0, m = 0;
		
		System.out.println("합을 구하고자 하는 수의 개수와 횟수를 띄어쓰기로 구분하여 입력하세요(1~100,000): ");
		n = scan.nextInt();
		m = scan.nextInt();
		int[] sum = new int[n+1];
		int[] num = new int[n+1];
		for(int i = 1; i < sum.length; i++) {
			num[i] = n;
			n--;
			if(i == 0) {
				sum[i] = num[i];
			}
			else {
			sum[i] = sum[i-1] + num[i];
			}
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int k = 1; k <= m; k++) {
			System.out.println("합을 구할 구간을 띄어쓰기로 구분하여 입력하세요: ");
			int i = scan.nextInt();
			int j = scan.nextInt();
			System.out.println(sum[j]-sum[i-1]);
		}
		scan.close();
	}

}
