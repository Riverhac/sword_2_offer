package Q57;

//删除排序链表中重复的节点

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void solve(ListNode head)
	{	
		if(head == null) return;
		ListNode pre = null;
		ListNode p = head;
		while(p!=null)
		{		
			ListNode pnext = p.next;
			boolean needdelete = false;
			if(p != null && pnext.val == p.val)
				needdelete = true;
			if(!needdelete)
			{
				pre = p;
				p=p.next;
			}
			else
			{
				int value = p.val;
				ListNode del = p;
				while(del!=null && del.val == value)
				{
					pnext = del.next;
					del = pnext;
				}
				if(pre == null)
					head = pnext;
				else
					pre.next = pnext;
				p = pnext;
			}
			
			
		}
		
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