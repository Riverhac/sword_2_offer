package Q52;
//������˻�������һ���������ڶ�̬�滮������������ÿ�����³ˣ����м���һ��һ��������
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
