package Q52;
//求数组乘积，除以一个。类似于动态规划的做法，不必每次重新乘，将中间结果一步一步存起来
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] solve(int[] A)
	{	
		
		int n = A.length;
		int[] B = new int[n];
		int[] C = new int[n];
		int[] D = new int[n];
		C[0]=D[n-1]=1;
		for(int i=1;i<n;i++)
		{
			C[i] = C[i-1] * A[i-1];
		}
		for(int i=n-2;i>=0;i--)
		{
			D[i] = D[i+1] * A[i+1];
		}
		for(int i=0;i<n;i++)
		{
			B[i] = C[i] * D[i];
		}
		return B;
		
	}

}
