package codingTest;

import java.util.Scanner;

public class Ex03_PrefixSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = 0, m = 0;
		
		System.out.println("합을 구하고자 하는 수의 개수와 횟수를 띄어쓰기로 구분하여 입력하세요(1~100,000): ");
		n = scan.nextInt();         // 합을 구하고자 하는 범위
		m = scan.nextInt();         // 합을 구하고자 하는 구역 설정 횟수
		int[] sum = new int[n+1];   // 누적 합의 배열
		int[] num = new int[n+1];   // 설정한 범위부터 역정렬용 배열
		for(int i = 1; i < sum.length; i++) {  //num[0]과 sum[0]은 비워놓고 채운다.
			num[i] = n;                        
			n--;		                       // num[1]= n num[2]=n-1...num[n]=1
			sum[i] = sum[i-1] + num[i];        // sum[1]=0+n sum[2]=n+n-1...
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int k = 1; k <= m; k++) { // 입력값 m만큼 반복
			System.out.println("합을 구할 구간을 띄어쓰기로 구분하여 입력하세요: ");
			int i = scan.nextInt();
			int j = scan.nextInt();
			System.out.println(sum[j]-sum[i-1]);
		}
		scan.close();
	}

}
