package Q6;
//����һ����������ǰ�����������������õ����������������ͷ���
public class binarytree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static BinaryTreeNode rebuildtree(int[] A,int[] B,int s1,int e1,int s2,int e2 )
	{
		int length1 = A.length;
		int length2 = B.length;
		if(length1!=length2) return null;
		int numberofleft = 0;
		for(int i=0;i<length2;i++)
		{
			if(A[0]==B[i]) 
			{
				numberofleft = i;
			}
		}		
		//A[0]���Ǹ� ,������������1~numberofleft,�ұ�numberofleft+1~length1
		//������������0~numberoflength-1,�ұ� numberoflength+1~length2
		
		BinaryTreeNode root = new BinaryTreeNode(A[0]);
		
		root.left=rebuildtree(A,B,1,numberofleft,numberofleft+1,length1);
		root.right=rebuildtree(A,B,0,numberofleft-1,numberofleft+1,length2);
		
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
