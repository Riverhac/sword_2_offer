package Q41;
//leetcode�е�two sum���⣬�ź�����������Һ�Ϊ�̶��������
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{1,2,3,5,6,7,8,9};
		int[] result = solve(A,6);
		if(result == null) System.out.println("�������");
		else 
			System.out.println(result[0]+" "+result[1]);
	}
	public static int[] solve(int[] A,int number)
	{	
		int length = A.length;
		if(length < 2) return null;
		int start = 0;
		int end = length-1;
		int[] result = new int[2];
		while(start < end)
		{	
			if(A[start] + A[end] == number)
			{
				result[0] = A[start];
				result[1] = A[end];
				return result;
			}
			if(A[start] + A[end] > number)
				end--;
			else
				if(A[start] + A[end] < number)
					start++;
		}
		return null;
	}

}
