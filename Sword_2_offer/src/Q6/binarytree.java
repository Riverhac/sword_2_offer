package Q6;
//给出一个二叉树的前序遍历和中序遍历，得到整棵树，并且输出头结点
public class binarytree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[]{1,2,4,7,3,5,6,8};
		int[] B=new int[]{4,7,2,1,5,3,8,6};
		
		int rootval = rebuildtree(A,B);
		System.out.println(rootval);
	}
	
	public static int rebuildtree(int[] A,int[] B)
	{	
		
		int length1 = A.length;
		int length2 = B.length;
		if(length1!=length2 || length1==0 || length2==0) return -1;
		
		BinaryTreeNode root = solve(A,B,0,length1-1,0,length2-1);
		return root.val;
	}
	public static BinaryTreeNode solve(int[] A,int[] B,int s1,int e1,int s2,int e2 )
	{
		
		if(s1==e1) return new BinaryTreeNode(A[s1]);
		int numberofleft = 0;
		int numberofright = 0;
		for(int i=s2;i<e2+1;i++)
		{
			if(A[s1]==B[i]) 
			{
				numberofleft = i-s2;
			}
		}		
		numberofright = e1-s1-numberofleft+s2;
		
		//A[0]就是根 ,先序遍历：左边1~numberofleft,右边numberofleft+1~length1-1
		//中序遍历：左边0~numberofleft-1,右边 numberofleft+1~length2-1
		
		BinaryTreeNode root = new BinaryTreeNode(A[s1]);
		if(numberofleft>0)
		{
			root.left=solve(A,B,s1+1,numberofleft+s1,s2,s2+numberofleft-1);
		}
		
		if(numberofright>0)
		{
			root.right=solve(A,B,numberofleft+s1+1,e1,s2+numberofleft+1,e2);
		}
		return root;
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
