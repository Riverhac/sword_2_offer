package Q25;

import java.util.ArrayList;
import java.util.List;


//二叉树中和为某一个值的路径（递归和回溯一起用）
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<Integer>> listlist = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(BinaryTreeNode root, int sum) {
        getSum(root,0,sum);
        return listlist;
    }
    public void getSum(BinaryTreeNode root,int sum,int target)
    {
        if(root==null) return;
        sum+=root.val;
        list.add(root.val);
        if(sum==target && root.left==null && root.right==null)
        {
            listlist.add(new ArrayList<Integer>(list));
        }
        getSum(root.left,sum,target);
        getSum(root.right,sum,target);
        sum-=root.val;
        list.remove(list.size()-1);
        return;
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