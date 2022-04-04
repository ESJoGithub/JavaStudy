package 연습문제;

public class Ex0317_05_error {

public static void main(String[] args) {
	int [][] array = new int [4][4];

		int i=0;
		int j=0;

	
/*	for(i=0; i<array.length; i++) {
		for(j=0; j<array[i].length; j++) {				
			array[i][j] = (int)(Math.random()*10+1);
		}
	}*/		
		int k=1;
	while(k<=10) {
		i=(int)Math.random()*3+1;
		j=(int)Math.random()*3+1;
		array[i][j]=(int)Math.random()*10+1;
		k++;
		System.out.print(array[i][j] + " ");
	}			
}
}