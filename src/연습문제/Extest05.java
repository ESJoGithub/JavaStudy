package 연습문제;

import java.util.Scanner;

public class Extest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("원의 중심과 반지름을 입력하시오.>>");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double r = scan.nextDouble();
		
		System.out.print("점을 입력하시오.>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if ((((x>a)?(x-a):(a-x))<=r)&&(((y>b)?(y-b):(b-y))<=r))
			System.out.print("점 ("+x+","+y+")는 원 안에 있습니다.");
			else 
			System.out.print("점 ("+x+","+y+")는 원 안에 있지 않습니다.");
					
		scan.close();
	}

}
