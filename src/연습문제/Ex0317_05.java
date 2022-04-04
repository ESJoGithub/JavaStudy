package 연습문제;

public class Ex0317_05 {

	public static void main(String[] args) {
		int [] array = new int [16];	
		int i=0;

		for(i=0; i<array.length; i++) {
			array[i]=0;
		}

		for(int j=0; j<10; j++) {
			i=(int)(Math.random()*15+1);
			if(array[i]==0){
				array[i] = (int)(Math.random()*10+1);
			}
			else {
				j--;
				continue;
			}
		}
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
			if(i%4==3) {
				System.out.println();
			}
		}
	}
}
