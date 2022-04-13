package 연습문제;
	import java.util.Scanner;
	
public class Ex0317_03_02 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오.>> ");
			int m = scan.nextInt();
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
					
		for(int i=0; i<unit.length; i++) {
			if(m/unit[i] != 0) {
				System.out.println(unit[i]+"원 짜리 : "+ m/unit[i] + "개");
			}
				m = m%unit[i];	
		}
		scan.close();
	}
}
/* Ex031703_01 식을 바탕으로 간결하게 만들 방법을 고민함
 * for문을 쓰기 때문에 몫이 0만 아니라면 몫을 출력하고
 * 나머지를 다음 피제수로 바꿔주면 된다는 점을 깨달음.
 */