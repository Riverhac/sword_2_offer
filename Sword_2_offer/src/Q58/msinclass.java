package Q58;
//�����������һ���ڵ㣨��ָ�򸸽ڵ��ָ�룩,����ʹ�õݹ飬�����õ�ѭ������

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
		//�жϸõ�����ĳ����������������������
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