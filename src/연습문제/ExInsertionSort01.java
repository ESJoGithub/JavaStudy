package 연습문제;

import java.util.Scanner;

public class ExInsertionSort01 {

	public static void main(String[] args) {

		int [] number = new int [11];
		int temp = 0;
		int position = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("마라톤 출전자들의 번호를 입력해주세요: ");

		for(int i = 1; i < number.length; i++) {
			number[i] = scan.nextInt();				
		}
		System.out.print("위치를 알고 싶은 출전자의 번호를 입력해주세요: ");
		number[0] = scan.nextInt();

		for(int i = 1; i < number.length; i++) {
			temp = number[i];
			for(int j = i-1; j >= 0; j--) {
				if(temp < number[j]) {
					number[j+1] = number[j];
					number[j] = temp;
				}				
			}			
		}
		for(int i = 0; i < number.length; i++) {
			if(i > 0 && number[i] == number[i-1]) {
				position = i;
				continue;
			}
			else {
			System.out.print(number[i] + " ");
			}
		}
		System.out.println();
		System.out.println(position);
		scan.close();
	}
	
}