package 연습문제;

	import java.util.Scanner;
	
	public class ExGCDLCM {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("바나나 개수를 입력하시오: ");
			int b = scan.nextInt();	
			System.out.print("토마토 개수를 입력하시오: ");
			int t = scan.nextInt();
			
			int gCD;
			long lCM;			// 바나나, 토마토 개수가 커지면 형변환에서 손실이 발생하므로 long타입 사용
			
			if(b < t) {           //토마토 개수가 바나나 개수보다 작은 경우
				int x = t;
			    	t = b;
			    	b = x;		  //토마토 개수와 바나나 개수를 바꾼다. 즉 무조건 b>c가 됨.
			}
			            		
			if(b%t == 0) {       // b/c가 0이면 최소공배수는 b, 최대공약수는 t가 됨 
				gCD = t;
				lCM = b;
			}				
				else {      
					long y = (long)b*(long)t;       
					// y는 바나나 개수*토마토 개수(값이 20억 이상이 될 수 있으므로 long타입 변환) 
					
					while(b%t != 0){	// b/c가 0이 아닐 때,				
					int z = t;			// 작은 수를 z에 저장
					t = b%t;			// 큰 수(피제수)/작은 수(제수) 나머지를 구해서 작은 수(제수)로 만든다 대입
					b = z;				// z에 저장된 원래 작은 수(제수)는 큰 수(피제수)로 만든다. b/c가 0이 될 때까지 반복
					}				
				gCD = t;		// b%t가 0이 되는 시점의 t, 즉 최대공약수
				lCM = y/t;		// 바나나*토마토를 최대공약수로 나눔
				}
			System.out.println("집행부에서 만든 팀은 총 "+ gCD +"팀이고,");
			System.out.println("구입한 바나나와 토마토의 개수는 총 " + lCM + "개이다.");
			scan.close();
		 	}		
		}	

