package Q16;

//翻转链表，有以下几种方法
//1、头部插入
//2、压入栈
//3、递归

public class reverselist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=50;
		ListNode[] lists = new ListNode[N];
		for(int i=0;i<N;i++)
		{
			lists[i]=new ListNode(i);
		}
		for(int i=0;i<N-1;i++)
		{
			lists[i].next = lists[i+1];
		}
		printlist(lists[0]);
		ListNode re = solve(lists[0]);
		printlist(re);
	}
	
	
	public static void printlist(ListNode head)
	{	
		ListNode p = head;
		while(p.next!=null)
		{
			System.out.print(p.val+"->");
			p=p.next;
		}
		System.out.println(p.val);
	}
	public static ListNode solve(ListNode head)
	{
		if(head==null || head.next==null) return head;
		ListNode phead = head;
		ListNode p = head;
		while(p.next!=null)
		{
			ListNode temp = p.next;
			p.next = temp.next;
			temp.next = phead;
			phead = temp;
		}
		return phead;
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