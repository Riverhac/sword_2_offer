package Q24;

//判断一组数是否为二叉搜索树的后序遍历

public class mainclass {


	public static boolean s(int[] A)
	{	
		int length = A.length;
		if(length==0) return false;
		return solve(A,0,length-1);
	}
	public static boolean solve(int[] A,int start,int end)
	{	
		if(start > end) return false;
		int i=start;
		for(;i<end;i++)
		{
			if(A[i]>A[end]) break;
		}
		int j=i;
		for(;j<end;j++)
		{
			if(A[j] < A[end]) return false;
		}
		
		boolean left = true;
		if(i>0)
			left = solve(A,0,i-1);
		boolean right = true;
		if(j>0)
			right = solve(A,i,end-1);
		return (left&&right);
	}

}
class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int v)
    {
    	val = v;
    	left = null;
    	right = null;
    }
}