package Q43;
//��n�����ӵĵ�����
//���ַ������ݹ�͵������ݹ����쳲���������һ�����ǳ������ã���������ֻ�õ�����
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(5);
	}
	public static void solve(int n)
	{	
		if(n==0) return;
		int[] result = new int[6*n+1];//Ϊ�˷��㣬�ͽ��±���Ϊ��
		
		for(int i=1;i<=6;i++)
		{
			result[i] = 1;
		}
		for(int i=2;i<=n;i++)
		{	
			int[] result_temp = new int[6*n+1];//Ϊ�˷��㣬�ͽ��±���Ϊ��
			
			//��i��6*i
			for(int j=i;j<=6*i;j++)
			{	
				for(int k=j-1;k>=j-6;k--)
				{
					if(k>=1) result_temp[j]+=result[k];
				}
			}
			result = result_temp;
		}
		for(int i=n;i<=6*n;i++)
		{
			System.out.println(i+":"+result[i]+" ");
		}
	}

}
