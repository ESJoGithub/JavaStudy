package exercise;
import java.util.Scanner;
public class Exercise_0414 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = scan.nextInt();

			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(answer < input){
				System.out.println("더 작은 수를 입력하세요.");				
			}
			else {
				System.out.println("맞혔습니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			}

		} while(true);
		scan.close();
	}
}
