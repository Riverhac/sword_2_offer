package Q38;
//在一个排序数组中找出某个数的个数
//方法1、从头到尾找，找到这个数，则继续下去，直到结束为止，复杂度 o(n)
//方法2、先用二分查找找到这个数，再左右铺展开，得到这个数的范围，复杂度o(n)
//方法3、（书上推荐方法）用二分查找分别找到该数的第一个和最后一个，复杂度o（logn）

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,6,7,9,12,12,12,12,12,23,45,67,78,987,6543,234567,7777777};
		System.out.println(solve1(A,12));
		System.out.println(solve2(A,12));
		System.out.println(solve3(A,12));
	}
	public static int solve1(int[] A,int number)
	{		
		int length = A.length;
		if(length==0) return 0;
		int times = 0;
		boolean flag = false;
		for(int i =0;i<length;i++)
		{	
			if(flag ==true && A[i] == number)
			{
				times++;
			}
			else	
			if( flag == false && A[i] == number)
			{
				flag = true;
				times++;
			}
			else
				if(flag ==true && A[i] != number)
				{
					break;
				}
				else continue;
		}
		return times;
	}
	
	public static int solve2(int[] A,int number)
	{
		int length = A.length;
		if(length==0) return 0;
		int times = 0;
		int center = binarysearch2(A,number,0,length-1);
		for(int i=center;i<length;i++)
		{
			if(A[i]==number) times++;
			else break;
		}
		for(int i=center;i>=0;i--)
		{
			if(A[i]==number) times++;
			else break;
		}
		times--;
		return times;
	}
	public static int binarysearch2(int[] A,int number,int low,int high)
	{	
		if(low == high && A[low]!=number) return -1;
		int middle = (low+high)/2;
		if(A[middle] == number) return middle;
		else
			if(A[middle] > number) return binarysearch2(A,number,low,middle-1);
			else return binarysearch2(A,number,middle+1,high);
	}
	
	public static int solve3(int[] A,int number)
	{	
		int length = A.length;
		if(length==0) return 0;
		int times = 0;
		int start = binarysearch3_start(A,number,0,length-1);
		int end = binarysearch3_end(A,number,0,length-1);
		times = end-start+1;
		return times;
	}
	
	public static int binarysearch3_start(int[] A,int number,int low,int high)
	{	
		if(low==high) 
		{
			if(A[low]==number) return number;
			if(A[low]!=number) return -1;
			
		}
		//找第一个出现
		int middle = (low+high)/2;
		if(A[middle] == number && A[middle-1] !=number) return middle;
		else
			if(A[middle] >= number) return binarysearch2(A,number,low,middle-1);
			else return binarysearch2(A,number,middle+1,high);
	}
	public static int binarysearch3_end(int[] A,int number,int low,int high)
	{	
		if(low==high) 
		{
			if(A[low]==number) return number;
			if(A[low]!=number) return -1;
			
		}
		//找最后一个出现
		int middle = (low+high)/2;
		if(A[middle] == number && A[middle+1] !=number ) return middle;
		else
			if(A[middle] <= number) return binarysearch2(A,number,middle+1,high);
			else return binarysearch2(A,number,low,middle-1);
	}
}
