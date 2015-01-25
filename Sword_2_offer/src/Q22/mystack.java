package Q22;

import java.util.Stack;

public class mystack {
	
	
	public static void main(String[] args)
	{
		int[] A = {1,2,3,4,5};
		int[] B = {4,3,5,1,2};
		System.out.println(iss(A,B));
	}
	
	public static boolean iss(int[] A,int[] B)
	{	
		Stack<Integer> stack = new Stack<Integer>();
		
		int length1 = A.length;
		int length2 = B.length;
		if(length1==0 || length2==0 || length1!=length2) return false;
		int i=0,j=0;
		stack.push(A[i]);
		while(j<=B.length)
		{	
			while(stack.peek() == B[j])
			{
				stack.pop();
				j++;
				if(j==length1) return true;
			}
			while(stack.peek()!=B[j])
			{	
				i++;
				if(i==length1) return false;
				stack.push(A[i]);
			}
		}
		return true;
	}
}
