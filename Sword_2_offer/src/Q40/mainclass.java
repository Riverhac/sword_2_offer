package Q40;
//找出数组中只出现1次的数字。这题有两个，就需要分开
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,5,7,9,23,34,67,89,234,456,76,21,11,33,2,5,7,9,23,34,67,89,234,456,43,76,21,11,33};//43,1
		int[] result = solve(A);
		System.out.println(result[0]+" "+result[1]);
	}
	public static int[] solve(int[] A)
	{
		int length = A.length;
		if(length < 2) return null;
		int sum = 0;
		for(int i=0;i<length;i++)
		{
			sum ^= A[i];
		}
		int index = findfirst(sum);
		int number1 = 0;
		int number2 = 0;
		for(int i=0;i<length;i++)
		{
			if(((A[i]>>index) & 1)==1) number1^=A[i];
			else number2^=A[i];
		}
		int[] result = new int[]{number1,number2};
		return result;
	}
	public static int findfirst(int sum)
	{
		int index = 0;
		while((sum & 1) == 0)
		{
			sum>>>=1;
			index++;
		}
		return index;
	}

}
