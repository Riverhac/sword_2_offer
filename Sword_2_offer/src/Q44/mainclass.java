package Q44;

import java.util.Arrays;

//判断顺子，大小王为0,其余1-13
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,4,7,3,0};
		boolean result = solve(A);
		System.out.println(result);
	}
	
	public static boolean solve(int[] A)
	{
		Arrays.sort(A);
		int i=0;
		for(;i<5;i++)
		{
			if(A[i] !=0) break; 
		}
		//有i个0
		int kongque=0;
		for(int j=i+1;j<5;j++)
		{
			if(A[j]==A[j-1]) return false;
			kongque+=A[j]-A[j-1]-1;
		}
		if(kongque <= i) return true;
		else return false;
	}
}
