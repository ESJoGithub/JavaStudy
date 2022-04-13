package 연습문제;

public class Ex0317_05_01 {

	//	4*4 배열을 만들고 1~10까지 정수 10개, 0 6개를 임의로 출력

	public static void main(String[] args) {
		int [] array = new int [16];	// 16개짜리 배열 만들기
		int i=0;                        // 정수를 넣을 임의의 위치를 정하기 위한 i

		for(i=0; i<array.length; i++) { // 배열 값을 모두 0으로 초기화
			array[i]=0;
		}

		for(int j=0; j<10; j++) {       // 16자리 중 임의의 10자리 선정
			i=(int)(Math.random()*15+1); 
			if(array[i]==0){            // 선정된 자리에 임의의 정수 넣기
				array[i] = (int)(Math.random()*10+1); 
			}			
			else {                      
				j--;
				continue;
			}/* 단 선정된 자리값이 0이 아니면 이미 정수가 들어가 있는 상태이므로
			 횟수를 1회 차감하고 다시 for문으로 돌아간다.*/
		}
		// 출력 + 문단나누기
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
			if(i%4==3) {
				System.out.println();
			}
		}
	}
}
