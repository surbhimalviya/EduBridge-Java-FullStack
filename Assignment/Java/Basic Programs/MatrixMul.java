public class MatrixMul
{
	public static void main(String[] args)
	{
		int[][] x={{1,2,3},{4,5,6},{7,8,9}};
		int[][] y={{5,6,7},{8,9,10},{2,3,4}};
		
		int [][] mul =new int [3][3];
		int i,j;
		for(i=0; i<x.length; i++)
		{
			for(j=0; j<x[0].length; j++)
		{
			mul[i][j]= x[i][j]*y[i][j];
		}
		}
		System.out.println(" Multiplication of matrix");
		for (i=0; i<x.length; i++)
		{
			for(j=0; j<x[0].length; j++)
		{
			System.out.format(" %d \t", mul[i][j]);
		}
		System.out.println("");
		}
	}
}