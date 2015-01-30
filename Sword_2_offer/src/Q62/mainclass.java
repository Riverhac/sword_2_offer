package Q62;
//���л��ͷ����л����������м����$����
public class mainclass {
	
	
	
	public  String serial(BinaryTreeNode root)
	{
		StringBuffer sb = new StringBuffer();
		solve(root,sb);
		return sb.toString();
	}
	
	public void solve(BinaryTreeNode node,StringBuffer sb)
	{
		if(node==null) 
		{
			sb.append('$');
			return;
		}
		else sb.append(node.val);
		solve(node.left,sb);
		solve(node.right,sb);
			
	}
	public BinaryTreeNode deserial(String s)
	{	
		return solve(null,s,true);//��������ο�����δ���У�
		
	}
	public BinaryTreeNode solve(BinaryTreeNode node,String s,boolean first)
	{
		BinaryTreeNode head = null;
		if(s.charAt(0)!='$') 
		{	
			
			node = new BinaryTreeNode (s.charAt(0)-'0');
			if(first==true)
			{
				 head = node;
				first = false;
			}
			solve(node.left,s.substring(1),first);
			solve(node.right,s.substring(2),first);
		}
		else
		{
			return head;
		}
		return head;
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