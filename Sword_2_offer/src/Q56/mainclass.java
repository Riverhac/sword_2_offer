package Q56;

//链表中环的入口
//先快慢指针进入环，再相遇，判断有没有环
//第二步，就是第一个公共节点的问题了，两个链表，第一个链表从头开始，第二个链表从相遇点开始，尾在相遇点前面一个node，第一个公共节点就是进入链表的节点
//或者按照书上的做法，先得到环的大小，两个都从链表头开始，一个快走n步。

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