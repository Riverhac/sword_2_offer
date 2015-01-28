package Q38;
//��һ�������������ҳ�ĳ�����ĸ���
//����1����ͷ��β�ң��ҵ���������������ȥ��ֱ������Ϊֹ�����Ӷ� o(n)
//����2�����ö��ֲ����ҵ����������������չ�����õ�������ķ�Χ�����Ӷ�o(n)
//����3���������Ƽ��������ö��ֲ��ҷֱ��ҵ������ĵ�һ�������һ�������Ӷ�o��logn��

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
		//�ҵ�һ������
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
		//�����һ������
		int middle = (low+high)/2;
		if(A[middle] == number && A[middle+1] !=number ) return middle;
		else
			if(A[middle] <= number) return binarysearch2(A,number,middle+1,high);
			else return binarysearch2(A,number,low,middle-1);
	}
}
