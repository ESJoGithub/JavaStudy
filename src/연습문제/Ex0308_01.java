package 연습문제;

import java.util.Scanner;
public class Ex0308_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String name = scanner.next();
		
		System.out.println(name +"씨 안녕하세요?");
		System.out.println("JAVA에 오신 것을 환영합니다.");
		
		System.out.print("첫 번째 정수를 입력하시오: ");
		int a = scanner.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오: ");
		int b = scanner.nextInt();
		
		int c = a+b;
				
		System.out.println(a+"과"+b+"의 합은 "+c+"입니다.");
		scanner.close();
		}

}
