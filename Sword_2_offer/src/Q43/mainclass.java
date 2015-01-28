package Q43;
//求n个骰子的点数和
//两种方法，递归和迭代，递归就像斐波那契数列一样，非常不采用！！！本文只用迭代。
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
		int[] result = new int[6*n+1];//为了方便，就将下标作为和
		
		for(int i=1;i<=6;i++)
		{
			result[i] = 1;
		}
		for(int i=2;i<=n;i++)
		{	
			int[] result_temp = new int[6*n+1];//为了方便，就将下标作为和
			
			//从i到6*i
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
