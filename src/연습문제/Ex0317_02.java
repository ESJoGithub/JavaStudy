package 연습문제;
	import java.util.Scanner;
	
public class Ex0317_02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오.>> ");
			String s = scan.next();
			char c = s.charAt(0);
		
		for(char i = c; i >= 'a'; i--) { 
			// 행이 작성한 문자부터 시작해서 a보다 같아질 때까지 감소
			for(char j = 'a'; j <= i; j++) {
			// 열이 a부터 시작해서 작성한 문자보다 같아질 때까지 증가
			System.out.print(j);
			}
			System.out.println();
		}	
		scan.close();
	}
}