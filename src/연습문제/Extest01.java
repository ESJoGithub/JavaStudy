package 연습문제;

import java.util.Scanner;

public class Extest01 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("원화를 입력하세요(단위 원)");
	double w = scan.nextDouble();
	double d = w/1200;
	System.out.print(w+"원은 $"+d+"입니다.");
	
scan.close();
	}
}