package Q39;
//判断一颗二叉树是不是平衡二叉树
//1、使用两边的深度，从头到尾判断，缺点是每一个点都要遍历好多遍
//2、从尾向前验证，每一个节点不需要遍历多次
import Q39.BinaryTreeNode;
public class balancetree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean solve1(BinaryTreeNode root)
	{
		//第一种方法
		if(root==null) return true;
		 int left = deep(root.left);
		 int right = deep(root.right);
		 if(left-right < -1 || left-right > 1)
			 return false;
		 return solve1(root.left) && solve1(root.right);
			
	}
	
	
	public static boolean isBalanced(BinaryTreeNode node,AuxClass aux){  
        if(node==null){  
            aux.depth=0;   
            return true;  
        }
        AuxClass left=new AuxClass();  
        AuxClass right=new AuxClass();  
        //get leftTreeDepth and rightTreeDepth of a node.If the 'diff' is bigger than 1,return false;true otherwise  
        if(isBalanced(node.left,left)&&isBalanced(node.right,right)){  
            int leftDepth=left.depth;  
            int rightDepth=right.depth;  
            int diff=leftDepth-rightDepth;  
            if(diff==1||diff==-1||diff==0){  
                aux.depth=leftDepth>rightDepth?leftDepth+1:rightDepth+1;  //把参数传到上一层
                return true;  
            }  
        }  
        return false;  
    }  
	 public static class AuxClass{  
	        private int depth;  
	    }  
	
	
	public static int deep(BinaryTreeNode root)
	{
		if(root==null) return 0;
		int left = deep(root.left);
		int right = deep(root.right);
		return left>right? (left+1):(right+1);
	}
}
