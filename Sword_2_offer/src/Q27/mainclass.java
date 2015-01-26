package Q27;

//����һ�����������������һ��˫������
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode solve(BinaryTreeNode root)
	{	
		ListNode rootnode = new ListNode(root.val);
		ListNode temp = null;
		if(root.left==null && root.right==null) return rootnode;
		if(root.left!=null)
		{			
			ListNode temp1 = solve(root.left);
			temp = temp1;
			while(temp1.next!=null)
			{
				temp1=temp1.next;
			}//�õ������������һ��
			temp1.next = rootnode;
			rootnode.pre = temp1;
		}
		else
			temp = rootnode;
		
		if(root.right!=null)
		{
			ListNode temp2 = solve(root.right);//�õ��������ĵ�һ��
			//���м䴮����
			
			rootnode.next = temp2;
			temp2.pre = rootnode;
		}
		
		return temp;
	}
}
class ListNode {//˫���������ݸ�ʽ
    int val;
    ListNode next;
    ListNode pre;
    ListNode(int x) {
        val = x;
        next = null;
        pre=null;
    }
}
class BinaryTreeNode {//�������������ݸ�ʽ
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