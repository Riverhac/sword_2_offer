package Q51;
//�������ظ�������,������n������Щ������0-n-1֮��
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,3,1,0,2,5,3};
		int result = solve(A);
		System.out.println(result);
	}
	public static int solve(int[] A)
	{
		int length = A.length;
		if(length == 0) return -1;
		for(int i=0;i<length;i++)
		{	
			while(A[i]!=i)
			{	
				if(A[i] == A[A[i]]) 
				{
					return A[i];
				}
				int temp = A[A[i]];
				A[A[i]] = A[i];
				A[i] = temp;
			}
		}
		return -1;
	}
	
}
