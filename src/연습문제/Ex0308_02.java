package 연습문제;

import java.util.Scanner;
public class Ex0308_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.print("분자를 입력하시오: " );
	int a = scanner.nextInt();
	
	System.out.print("분모를 입력하시오: ");
	int b = scanner.nextInt();
	
	int c = a/b;
	int d = a%b;
	
	System.out.println("나눗셈의 몫 = "+c);
	System.out.print("나눗셈의 나머지 = "+d);
	scanner.close();

	}
}
