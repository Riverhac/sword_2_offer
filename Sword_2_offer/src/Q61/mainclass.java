package Q61;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//按照之字形打印二叉树
//1、在60题基础上，用一个栈保存偶数行，反向打印
//2、使用两个栈（书上方法）
public class mainclass {

//应用题60的方法,加上奇偶数判断
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
	public void solve2(BinaryTreeNode root)//使用两个栈的方法
	{
		//因为java中不支持泛型数组，所以这里暂时不能演示。可以通过另外的方法做到交换栈
			
		
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