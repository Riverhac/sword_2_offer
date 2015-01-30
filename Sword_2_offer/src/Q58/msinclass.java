package Q58;
//中序遍历的下一个节点（有指向父节点的指针）,这里使用递归，书上用的循环迭代

public class msinclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static BinaryTreeNode solve(BinaryTreeNode node)
	{
		if(node.right!=null) return findleft(node.right);
		else return solvehelp(node);
			
	}
	public static BinaryTreeNode findleft(BinaryTreeNode root)
	{
		if(root.left == null) return root;
		return findleft(root.left);
	}
	public static BinaryTreeNode solvehelp(BinaryTreeNode node)
	{
		//判断该点事在某棵树的左子数还是右子数
		BinaryTreeNode temp = node.father;
		if(temp==null) return null;
		else
		{
			if(temp.left == node) return temp;
			else return solvehelp(temp);
		}
	}
}
class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode father;
    BinaryTreeNode(int v)
    {
    	val = v;
    	left = null;
    	right = null;
    	father = null;
    }
}