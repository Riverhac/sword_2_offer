package Q29;
//数组中超过次数一半的数，将它找出来
//1、用快读排序，如果指标数在n/2后，则在前n/2找，反之亦然。
//2、用数组的特点
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,1,1,3,1,4,5,1,6,7,1,1,1,6,1,5,1,4,3,1,2,1};
		System.out.println(solve1(A));
	}
	public static int solve1(int[] A)
	{	
		int length = A.length;
		if(length==0) return Integer.MIN_VALUE;//可以用全局变量来标注
		int middle = length>>1;
		int start = 0;
		int end = length-1;
		int index = partition(A,start,end);
		while(index != middle)
		{
			if(index > middle)
			{
				end = index-1;
				index = partition(A,start,end);
			}
			else
			{
				start = index+1;
				index = partition(A,start,end);
			}
			
		}
		int result = A[middle];
		return result;
	}
	
	public static int partition(int[] A,int start,int end)
	{	
		
		//快排程序，返回第一个值在A中的最后位置
		int flag = A[start];
		while(start < end)
		{
			while(A[end] > flag)
			{
				end--;
			}
			int temp = A[end];
			A[end] = flag;
			A[start] = temp;
			start++;
			if(start < end)
			{
				while(A[start] < flag)
				{
					start++;
				}
				temp = A[start];
				A[start] = flag;
				A[end] = temp;
				end--;
			}
		}
		return start;
	}
	
	public static int solve2(int[] A)
	{	
		int length = A.length;
		if(length==0) return Integer.MIN_VALUE;
		int result = A[0];
		int times = 1;
		for(int i=0;i<length;i++)
		{
			if(times == 0)
			{
				result = A[i];
				times = 1;
			}
			else
				if(A[i] == result) times++;
				else times--;
		
		}
		return result;
	}
}
