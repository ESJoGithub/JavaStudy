package 연습문제;
	import java.util.Scanner;
	
public class Ex0317_03_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오.>> ");
		int money = scan.nextInt();
		int []unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

		for(int i=0; i<8; i++) {
			int x = money/unit[i];
			int y = money%unit[i];
			
			if(y!=0) {
			 money = y;
			}
			if(x==0) {
				System.out.print("");
			}
			else {
				System.out.println(unit[i]+"원 짜리 : "+ x +"개");
			}		
		}
	scan.close();
	}
}

/* 가장 처음 만들었던 코드는 for문을 배우기 전이라 모두 직접 계산함. (class Extest02)
 * 이 식도 배열과 for문, if문을 모두 썼지만
 * 평소 풀던 수학 방식을 버리지 못해서 몫을 x로 두고 나머지를 y로 두어서 if문을 따로 돌림
 */


