package 연습문제;

import java.util.*;

public class ExSelectionSort_Grading03 {

	public static void main(String[] args) {

		ArrayList<String> sort = new ArrayList<String>();
		ArrayList<String> orgn = new ArrayList<String>();
		String [] grade = {"A+", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 10명의 점수를 차례대로 입력하세요: ");
		for(int i = 0; i < 10; i++) {
			String n = scan.next();
			sort.add(n);
			orgn.add(n);
		}

		Collections.sort(sort);
		Collections.reverse(sort);

		for(int i = 0; i < sort.size(); i++) {
			for(int j = 0; j < orgn.size(); j++) {				
				if(sort.get(i) == orgn.get(j)) {
					orgn.remove(j);			//배열이 아니므로 지워주지 않으면 값이 계속 추가된다.
					orgn.add(j, grade[i]);
				}
			}
		}
		System.out.print("학생들의 성적은 다음과 같습니다:  ");	
		System.out.print(orgn);
		scan.close();
	}

}
