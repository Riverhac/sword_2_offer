package Q8;
//Ѱ����ת�����е���Сֵ
public class minnumberinchar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A ={1,1,1,1,0,1,1,1};
		System.out.println(find(A));
	}

	
	public static int find(int A[])
	{	
		int length = A.length;
		if(length==0) return -1;
		int low=1,high=length-2;
		while(low<high)
		{
			if(A[low] == A[0]) 
				low++;
			else break;
		}
		low--;
		while(low<high)
		{
			if(A[high]==A[length-1]) 
				high--;
			else break;
		}
		high++;
		//��ȥ�������߿�����ͬ��ֵ
		if(A[0]<A[length-1]) return A[0];
		return binarysearch(A,low,high);
	}
	public static int binarysearch(int[] A,int low,int high)
	{
		if(low==high) return A[low];
		int middle = (low+high)/2;
		if(A[middle] > (A[low]+A[high])/2 ) return binarysearch(A,middle+1,high);
		else return binarysearch(A,low,middle);
	}
	
}
