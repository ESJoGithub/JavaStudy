package 연습문제;

import java.util.Scanner;
public class Ex0308_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("화씨 온도 : ");
		double f = scan.nextDouble();
		double c = (f-32)*5/9;
		
		System.out.print("섭씨 온도 : "+c);
	scan.close();
	}
}
