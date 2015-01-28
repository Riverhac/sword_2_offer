package Q39;

//二叉树的深度，递归
//左子树和右子树深度的最大值加上1


public class mainclass {



	public  int solve(BinaryTreeNode root)
	{
		if(root==null) return 0;
		int left = solve(root.left);
		int right = solve(root.right);
		return left>right? (left+1):(right+1);
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