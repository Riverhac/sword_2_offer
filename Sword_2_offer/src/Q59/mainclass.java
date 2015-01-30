package Q59;

//ÅÐ¶Ï¶þ²æÊ÷ÊÇ·ñ¶Ô³Æ,µÝ¹é

public class mainclass{
	
	public boolean issym(BinaryTreeNode root)
	{
		if(root==null) return false;
		return help(root.left,root.right);
	}
	public boolean help(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		if(root1==null && root2==null) return true;
		if(root1==null || root2==null) return false;
		if(root1.val != root2.val) return false;
		return help(root1.left,root2.right) && help(root1.right,root2.left);
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