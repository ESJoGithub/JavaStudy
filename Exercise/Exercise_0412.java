package Exercise;

public class Exercise_0412 {

	public static void main(String[] args) {
		// 구구단 일부 출력하기

		int k = 2;
		TIMES: for(int i = 1; i <= 3; i++) {
			for(int j = k; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i*j +"\t");
				if (j == 4 || j == 7 || j == 9) {
					System.out.println();
					if(i < 3) {
					continue TIMES;
					}
					else {
						System.out.println();
						k = j+1;
						i = 0;
						continue TIMES;
					}
				}
			}
		}
	}
}

