public class SumbyRowColumn
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3},
					{4,5,6},
					{7,8,9}};
        int rowsum, colsum,i,j;
		System.out.println("Row sum");
		for(i=0;i<3;i++)
		{
			rowsum=0;
			for(j=0;j<arr[i].length;j++)
			{
				rowsum=rowsum+arr[i][j];
			}
			System.out.println("sum of "+i+"row "+rowsum);
		}
		System.out.println("Column sum");
		for(i=0;i<3;i++)
		{
			colsum=0;
			for(j=0;j<3;j++)
			{
				colsum=colsum+arr[j][i];
			}
			System.out.println("sum of "+i+"column "+colsum);
		}
	}
}