package githubPractices.matrix;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,0}
		};
		
		setZeroes(matrix, 4, 4);
	}

	static void setZeroes(int[][] matrix, int m, int n)  {
		for(int i = 0 ; i < m ; i++)  {
			for(int j=0;j<n;j++)  {
				if(matrix[i][j]  == 0)  {
					marker(i, j , matrix, m, n);
				}
			}
		}
	}
	
	static void marker(int i, int j, int[][] matrix, int m, int n)  {
		//for(int p = 0; )
	}
}
