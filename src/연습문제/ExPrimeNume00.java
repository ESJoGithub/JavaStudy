package 연습문제;

import java.util.Scanner;

public class ExPrimeNume00 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 두 개 입력하시오: ");
		int n = scan.nextInt();
		int m = scan.nextInt();

		int count = 1; // 줄바꿈을 위한 소수 개수 계산용. 2가 포함되므로 1로 시작.

		if(n>m) {
			int temp = n; n = m; m = temp;
		}
		// n 이 m보다 큰 경우 m과 n을 바꿔준다
		if(n<=2) {
			System.out.print(2 + " ");
		}
		// n이 2보다 작거나 같으면 소수인 2를 반드시 출력함

		int i; int j;

		for(i=n; i<=m; i++) {         // n부터 m까지 수
			for(j=2; j<m; j++) {      // 2부터 m까지 수를 제수로 함
				if(i%j == 0) {	      // n을 위의 제수로 하나씩 나눌 때				
					break;               
				}        // n이 다른 숫자로 나누어지면 다음 숫자로 넘어간다.
				else if(j==i-1){       
					System.out.print(i+" ");
					count++;
					/* 제수가 피제수보다 하나 작을 때까지 나누어지지 않으면 피제수 (i)출력하고
					   출력한 피제수의 개수를 하나씩 카운트한다. */
					if(count%10==0) {
						System.out.println(); //소수 열 개에 하나씩 줄바꿈
					}
				}		
			}
		}

	}
}
