package 연습문제;

import java.util.Scanner;

public class Ex0308_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오. : ");
			int a = scan.nextInt();
			int b = a%2;
	System.out.print(((b==0)?("짝수"):("홀수"))+"입니다.");
		
	scan.close();
	}

}
