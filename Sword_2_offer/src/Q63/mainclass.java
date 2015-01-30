package Q63;


//二叉搜索树的第k个节点,只要采用中序遍历即可
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int number = 0;
	public static int solve(BinaryTreeNode root,int k)
	{
		 if(root == null) return Integer.MIN_VALUE;
		  if(root.left != null)   return solve(root.left,k);
		 number++;
		 if(number==k) return root.val;
		  if(root.right != null)  return solve(root.right,k);
		  return Integer.MIN_VALUE;
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