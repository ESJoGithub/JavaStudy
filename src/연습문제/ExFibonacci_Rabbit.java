package 연습문제;

import java.util.Scanner;

public class ExFibonacci_Rabbit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while(true) {
			System.out.print("토끼를 관찰할 기간을 입력하세요(10~100 사이): ");
			n = scan.nextInt();

			if(n<10 || n>100)
				System.out.println("잘못된 범위의 값을 입력하였습니다. 다시 입력하세요.");
			else
				break;
		} 
		// 입력한 숫자가 10보다 작거나 100보다 클 때 입력 반복

		int r1, r2, r3;
		r1 = 1;
		r2 = 1;		
		r3 = 0;
		
		for(int i=1; i<=n; i++){ 
		// 첫 달부터 n달까지 관찰기간이므로 1부터 시작
			
			if(i<=2) {
				r3 = 1;
				System.out.print(r3+"\t");
			}
		// 첫 두 달 간은 토끼 한 쌍이 유지됨	
			
			else {
				r3 = r1+r2;
				r1 = r2;
				r2 = r3;

		/* 세 번째 달부터 바로 앞의 두 피보나치 수의 합이 된다. 
		   그리고 r1은 r2로, r2는 r3로 초기화*/		
				
				if ((long)r1+r2 > 2147483647L) {
					System.out.print(r3 +"\t");
					
					break;
				}
		/* (long 타입 변환을 하여)다음 반복될 r1+r2가 (사실상 r2+r3값)이
		   2147483647을 넘었는지 판단 후, 넘었다면 r3 출력 후 for문을 벗어난다.
		   이 때 r3 값을 기준으로 하면 안되는 것이 이미 r1+r2값이 r3로 대입되면서 int로 형 변환이 일어난 상태라
		   앞에 명시적 형 변환으로 (long)을 붙여준다고 해도 int가 오버플로우한 -값이 나와서 의미 없기 때문이다. */
				else {
					System.out.print(r3+"\t");
				}
			}
			if(i%10==0) {
				System.out.println();
			}
		// 줄 바꿈
		}
		scan.close();
	}

}
