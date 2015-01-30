package Q56;

//�����л������
//�ȿ���ָ����뻷�����������ж���û�л�
//�ڶ��������ǵ�һ�������ڵ�������ˣ�����������һ�������ͷ��ʼ���ڶ�������������㿪ʼ��β��������ǰ��һ��node����һ�������ڵ���ǽ�������Ľڵ�
//���߰������ϵ��������ȵõ����Ĵ�С��������������ͷ��ʼ��һ������n����

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static boolean hascircle=false;
	public static ListNode meetnode(ListNode head)
	{	
		if(head == null || head.next == null) return null;
		ListNode slow = head;
		ListNode fast = head;
		while(slow!=null && fast!=null)
		{		 
			if(slow==fast) return fast;
			slow=slow.next;
			fast = fast.next;
			if(fast!=null)
				fast = fast.next;
		}
		return null;
	}
	
	public static ListNode startnode(ListNode head)
	{
		ListNode meetnode = meetnode(head);
		ListNode p = meetnode;
		int circlelength = 0;
		while(p.next!=meetnode)
		{
			circlelength++;
			p=p.next;
		}
		p = head;
		ListNode q = head;
		for(int i=0;i<circlelength;i++)
		{
			p=p.next;
		}
		while(p!=q)
		{
			p=p.next;
			q=q.next;
		}
		return p;
		
	}

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}