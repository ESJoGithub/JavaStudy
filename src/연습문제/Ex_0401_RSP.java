package 연습문제;

import java.util.*;

public class Ex_0401_RSP {
	public static void judg(int a, int b) {
		if((a-b) == 1 || (b-a) == 2) {
			System.out.println("당신이 승리하였습니다.");
		}
		else if(a==b) {
			System.out.println("비겼습니다.");
		}
		else {
			System.out.println("당신이 패배하였습니다.");
		}
	}	
	public static int changeToInt(String rSP) {
		int num = 0;
		switch(rSP) {
		case "가위":  num = 1; break;
		case "바위":  num = 2; break;
		case "보": 	 num = 3; break;
		case "네": 	 num = 1; break;
		case "아니오": num = 2; break;
		case "아니요": num = 2; break;
		}
		return num;
	}	

	public static void main(String[] args) {
		int user = 0; 
		int com = 0;
		int stop = 0;

		String [] rspKor = {"가위", "바위", "보"};

		Scanner scan = new Scanner(System.in);
		System.out.println("[가위, 바위, 보 대결]");
		do {
			System.out.print("가위, 바위, 보 중에 무엇을 내시겠습니까? : ");
			user = changeToInt(scan.next());
			com = (int)(Math.random()*3+1);
			System.out.print("컴퓨터가 " + rspKor[com-1] +"를 냈습니다. ");
			judg(user, com);
			System.out.print("다시 도전하시겠습니까? (네/아니오) : ");
			stop = changeToInt(scan.next());
		} while(stop != 2);	
		System.out.println("대결을 종료합니다...");
		scan.close();
	}

}
