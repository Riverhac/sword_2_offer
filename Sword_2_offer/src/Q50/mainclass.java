package Q50;


//寻找最低公共父节点，方法1，树为二叉搜索树
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static BinaryTreeNode solve(BinaryTreeNode root,BinaryTreeNode node1,BinaryTreeNode node2)
	{	
		
		if(root.val > node1.val && root.val > node2.val) return solve(root.left,node1,node2);
		else if(root.val < node1.val && root.val < node2.val) return solve(root.right,node1,node2);
		else return root;
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