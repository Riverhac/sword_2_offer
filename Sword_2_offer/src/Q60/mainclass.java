package Q60;

import java.util.LinkedList;
//打印二叉树。两种方法
//1、书上方法，建立queue，采用两个变量，一个变量是本行未打印的数量，一个变量记录下一行的数量
//2、方法2，每行结尾加入null作为标示符号
import java.util.Queue;

public class mainclass {


	public void solve1(BinaryTreeNode root)
	{
		if(root==null) return;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		int tobeprint = 1;
		int nextlevel = 0;
		while(!queue.isEmpty())
		{
			BinaryTreeNode temp = queue.poll();
			System.out.print(temp.val+" ");
			if(root.left != null)
			{
				nextlevel++;
				queue.add(root.left);
			}
			if(root.right!=null)
			{
				nextlevel++;
				queue.add(root.right);
			}
			tobeprint--;
			if(tobeprint==0)
			{	
				System.out.println("");
				tobeprint = nextlevel;
				nextlevel = 0;
			}
			
		}
	}
	
	public void solve2(BinaryTreeNode root)
	{	
		if(root==null) return;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty())
		{
			BinaryTreeNode temp = queue.poll();
			if(temp==null) 
			{	
				if(queue.isEmpty()) break;
				queue.add(null);
				System.out.println("");
			}
			else
			{
				System.out.print(temp.val+" ");
				if(temp.left!=null) queue.add(temp.left);
				if(temp.right!=null) queue.add(temp.right);
				
			}
		}
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
