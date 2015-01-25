package Q19;


public class mirrow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void getmirrow(BinaryTreeNode root)
	{
		if(root==null) return;
		if(root.left ==null && root.right==null) return;
		BinaryTreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left!=null)
			getmirrow(root.left);
		if(root.right!=null)
			getmirrow(root.right);   
		
		
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