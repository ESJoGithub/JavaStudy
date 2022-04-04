package 연습문제;

import java.util.Scanner;

public class Extest06_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scan.nextInt();
		switch (month) {
			case 12:
			case 1:
			case 2:
			System.out.print("겨울");
			break;
			case 3:
			case 4:
			case 5:
			System.out.print("봄");
			break;
			case 6:
			case 7:
			case 8:
			System.out.print("여름");
			break;
			default:
			System.out.print("가을");
			break;
	}
		
	scan.close();
	}
}