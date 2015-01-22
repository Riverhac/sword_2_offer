package Q3;

public class Find_in_2d_matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int matrix[][]={{1,2,8,9},
							{2,4,9,12},
							{4,7,10,13},
							{6,8,11,15}};
			boolean n = ishasnumber(3,matrix);
			System.out.println(n);
	}
	

	public static boolean ishasnumber(int number,int matrix[][])
	{	
		
		int m = matrix.length;
		if(m==0) return false;
		int n = matrix[0].length;
		if(n==0) return false;
		int i=0,j=n-1;
		while(i<m && j>-1)
		{
			if(matrix[i][j]==number) return true;
			if(matrix[i][j] < number) i++;
			else j--;
		}
		return false;
	}
}