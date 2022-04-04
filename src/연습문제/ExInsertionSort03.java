package 연습문제;

import java.util.*;

public class ExInsertionSort03 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		System.out.print("마라톤 출전자들의 번호를 입력해주세요: ");

		for(int i = 0; i < 10; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		
		System.out.print("위치를 알고 싶은 출전자의 번호를 입력해주세요: ");
		int position = scan.nextInt();
		
			System.out.println(list);
		for(int i=0; i<list.size(); i++ ) {
			if(list.get(i) == position) {
				System.out.println(i+1);
				}
			}	
		scan.close();
	}

}