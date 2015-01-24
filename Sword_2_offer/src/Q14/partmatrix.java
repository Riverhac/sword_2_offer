package Q14;
//将数组分组，奇数在前面，偶数在后面
public class partmatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,3,4,7,8,6,5,32,234,5435,46,567,4,534,1534,6,657,7,687,5,4,4342,43,75,};
		partm(A);
		for(int i:A)
		{
			System.out.print(i+" ");
		}
	}
	public static void partm(int[] A)
	{	
		int length = A.length;
		if(length==0) return;
		int start = 0;
		int end = length-1;
		while(start < end)
		{
			while(start<end && ((A[start] & 1)==1)) start++;
			while(start<end && ((A[end] & 1)==0)) end--;
			if(start < end)
			{
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
			}
		}
	}

}
