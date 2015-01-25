package Q18;
//输入两棵树，判断一棵树是不是另一棵树的子树

public class sontree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean issontree(BinaryTreeNode A,BinaryTreeNode B)
	{
		boolean result = false;
		if(A!=null && B!=null)
		{
			if(A.val==B.val)
				result = doestreehassubtree(A,B);
			if(!result)
				result = issontree(A.left,B);
			if(!result)
				result = issontree(A.right, B);			
		}
		return result;
	}
	
	public static boolean doestreehassubtree(BinaryTreeNode A,BinaryTreeNode B)
	{
		if(B==null) return true;
		if(A==null) return false;
		if(A.val!=B.val) return false;
		return doestreehassubtree(A.left,B.left)&& doestreehassubtree(A.right,B.right);
		
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