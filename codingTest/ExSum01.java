package codingTest;

import java.util.Scanner;

public class ExSum01 {

	public static void main(String[] args) {

		int count = 0; 
		int sum = 0; 
		String sNum = new String(); 
		char [] cNum; 

		Scanner scan = new Scanner(System.in); 

		while(count == 0) { 
			System.out.print("합산할 숫자의 개수를 입력해주세요(1~100): "); 
			count = scan.nextInt(); 
			if(count < 1 || count > 100) { 
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력해주세요."); 
				count = 0; 
			} 
		} 
		if(count != 0) { 
			System.out.print("합산할 숫자들을 띄어쓰기 없이 입력해주세요: "); 
			sNum = scan.next(); 
		}
		
		cNum = new char [count];  
		cNum = sNum.toCharArray(); 

		for(int i = 0; i < count; i++){ 
			sum += ((int)cNum[i]-48); 
		} 
		System.out.println(sum); 
		scan.close(); 
	} 
}
