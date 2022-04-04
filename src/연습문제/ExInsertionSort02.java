package 연습문제;

import java.util.Scanner;

public class ExInsertionSort02 {

	public static void main(String[] args) {

		int [] number = new int [10];
		int temp = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("마라톤 출전자들의 번호를 입력해주세요: ");

		for(int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();				
		}
		
		System.out.print("위치를 알고 싶은 출전자의 번호를 입력해주세요: ");
		int position = scan.nextInt();

		for(int i=0; i<number.length; i++ ) {    
			for(int j=i+1; j<number.length; j++) {  
				if(number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}	
		}
		for(int i = 0; i < number.length; i++) {
			if(number[i] == position) {
				System.out.print(number[i] + " ");
				position = i;
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