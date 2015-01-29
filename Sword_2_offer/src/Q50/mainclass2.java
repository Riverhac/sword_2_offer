package Q50;

//最低公共父亲，每个节点都有指向父亲的节点，就是找第一个公共节点
public class mainclass2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static BinaryTreeNode_1 solve(BinaryTreeNode_1 root,BinaryTreeNode_1 node1,BinaryTreeNode_1 node2)
	{	//长的先走一部分，再一起走，边走边比较，相同则就是这个节点
		BinaryTreeNode_1 p = node1;
		int pnumber = 0;
		BinaryTreeNode_1 q = node2;
		int qnumber = 0;
		while(p!=null)
		{
			p=p.father;
			pnumber++;
		}
		while(q!=null)
		{
			q=q.father;
			qnumber++;
		}
		p = node1;
		q= node2;
		if(pnumber > qnumber)
		{
			for(int i=0;i<pnumber-qnumber;i++)
			{
				p = p.father;
			}
		}
		if(qnumber > pnumber)
		{
			for(int i=0;i<qnumber-pnumber;i++)
			{
				q = q.father;
			}
		}
		while(p!=null)
		{
			if(p==q) return p;
			else
			{
				p=p.father;
				q=q.father;
			}
		}
		return p;
		
	}
}
class BinaryTreeNode_1 {
    int val;
    BinaryTreeNode_1 left;
    BinaryTreeNode_1 right;
    BinaryTreeNode_1 father;
    BinaryTreeNode_1(int v)
    {
    	val = v;
    	left = null;
    	father = null;
    	right = null;
    }
}