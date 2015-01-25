package Q23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//BFS二叉树,与书上有点不一样

public class printBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void solve(BinaryTreeNode bt)
	{	
		if(bt==null) return;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(bt);
		while(!queue.isEmpty())
		{
			BinaryTreeNode temp= queue.poll();
			if(temp.left!=null) queue.add(temp.left);
			if(temp.right!=null) queue.add(temp.right);
			
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