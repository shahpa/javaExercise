package githubPractices;

public class MatrixMatrix {
	public static void main(String[] args)  {
		int[][] a = new int[][] {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9} };
		int[][] b = new int[3][3];
		
		for(int i=0,l=2; i<3;i++,l--)  {
			for(int j=0; j<3; j++)  {
				b[j][l] = a[i][j];
			}
		}
		
		for(int i=0; i<3; i++)  {
			for(int j=0; j<3; j++) {
				
				System.out.print(b[i][j] + ",");
			}
			System.out.println("");
		}
	}
}
