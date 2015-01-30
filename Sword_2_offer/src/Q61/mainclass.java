package Q61;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//����֮���δ�ӡ������
//1����60������ϣ���һ��ջ����ż���У������ӡ
//2��ʹ������ջ�����Ϸ�����
public class mainclass {

//Ӧ����60�ķ���,������ż���ж�
	public void solve1(BinaryTreeNode root)
	{
		if(root==null) return;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		int tobeprint = 1;
		int nextlevel = 0;
		boolean odd = false;
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty())
		{	
			
			BinaryTreeNode temp = queue.poll();
			if(odd)
			{	
				System.out.print(temp.val+" ");
			}
			if(root.left != null)
			{
				nextlevel++;
				queue.add(root.left);
				if(odd)
				{
					stack.add(root.left.val);
				}
			}
			if(root.right!=null)
			{
				nextlevel++;
				queue.add(root.right);
				if(odd)
				{
					stack.add(root.right.val);
				}
			}
			tobeprint--;
			if(tobeprint==0)
			{	
				if(!odd)
				{
					while(!stack.isEmpty())
					{
						System.out.print(stack.pop()+" ");
					}
				}
				if(odd== !odd)
				System.out.println("");
				tobeprint = nextlevel;
				nextlevel = 0;
			}
			
		}
	}
	public void solve2(BinaryTreeNode root)//ʹ������ջ�ķ���
	{
		//��Ϊjava�в�֧�ַ������飬����������ʱ������ʾ������ͨ������ķ�����������ջ
			
		
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