package 연습문제;

import java.util.Scanner;

public class Extest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오.>>");
		int money = scan.nextInt();
		int a = money/50000;
		int b = (money%50000)/10000;
		int c = ((money%50000)%10000)/1000;
		int d = (((money%50000)%10000)%1000)/100;
		int e = ((((money%50000)%10000)%1000)%100)/50;
		int f = (((((money%50000)%10000)%1000)%100)%50)/10;
		int g = (((((money%50000)%10000)%1000)%100)%50)%10;
	System.out.println("오만원권"+a+"매");
	System.out.println("만원권"+b+"매");
	System.out.println("천원권"+c+"매");
	System.out.println("백원"+d+"개");
	System.out.println("오십원"+e+"개");
	System.out.println("십원"+f+"개");
	System.out.println("일원"+g+"개");
	
	scan.close();
	}

}
