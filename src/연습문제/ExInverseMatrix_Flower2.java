package 연습문제;

import java.util.*;

public class ExInverseMatrix_Flower2 {

	public static void main(String[] args) {

		ArrayList<String> coe = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		System.out.println("방정식의 계수들을 순서대로 입력해주세요: ");
		for(int i = 0; i < 9; i++) {
			String coefficient = scan.next();
			coe.add(coefficient);
		}
		System.out.println("방정식의 상수항들을 순서대로 입력해주세요: ");
		for(int i = 1; i < 4; i++) {
			String coefficient = scan.next();
			coe.add(i*4-1, coefficient);
		}		

		double [] coef = new double[12];
		double [] temp = new double[12];

		for(int i = 0; i < coef.length; i++) {
			coef[i] = Double.parseDouble(coe.get(i));
		}

		int count = 0;

		while(count<3) {
			int i;

			for(i=0; i<4; i++) {
				temp[i] = coef[i]/coef[count];
			}
			
			for(i=4; i<8; i++) {
				temp[i] = coef[i]-coef[4+count]*temp[i-4];
			}
			
			for(i=8; i<12; i++) {
				temp[i] = coef[i]-coef[8+count]*temp[i-8];
			}
			
			for(i=0; i<12; i++) {
				coef[(i+8)%12]=temp[i];
			}
			count++;
		}
		System.out.println();
		System.out.printf("%2.1f\t%2.1f\t%2.1f\t%n", coef[0],coef[1],coef[2]);
		System.out.printf("%2.1f\t%2.1f\t%2.1f\t%n", coef[4],coef[5],coef[6]);
		System.out.printf("%2.1f\t%2.1f\t%2.1f\t%n", coef[8],coef[9],coef[10]);
		System.out.println();
		System.out.printf("x=%2.1f y=%2.1f z=%2.1f입니다.", coef[3], coef[7], coef[11]);
		scan.close();
	}
}