package 연습문제;

public class ExInverseMatrix_Flower {

	public static void main(String[] args) {

		double [] x = {1, 1, 1, 100, 2000, 900, 500, 54700, 6, 25, 10, 1160};
		double [] temp = new double[12];

		int count = 0;

		while(count<3) {
			int i;

			for(i=0; i<4; i++) {
				temp[i] = x[i]/x[0+count];
				System.out.print(temp[i]+"\t");
			}
			System.out.println();
			for(i=4; i<8; i++) {
				temp[i] = x[i]-x[4+count]*temp[i-4];
				System.out.print(temp[i]+"\t");
			}
			System.out.println();
			for(i=8; i<12; i++) {
				temp[i] = x[i]-x[8+count]*temp[i-8];
				System.out.print(temp[i]+"\t");
			}
			System.out.println();
			for(i=0; i<12; i++) {
				x[(i+8)%12]=temp[i];
			}
			count++;
		}
		System.out.printf("x=%2.5f y=%2.5f z=%2.5f입니다.", x[3], x[7], x[11]);
	}
}