package Q13;



public class deletefromlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=500;
		ListNode[] lists = new ListNode[N];
		for(int i=0;i<N;i++)
		{
			lists[i]=new ListNode(i);
		}
		for(int i=0;i<N-1;i++)
		{
			lists[i].next = lists[i+1];
		}
		delete(lists[0],lists[N/2]);
		printlist(lists[0]);
		delete(lists[0],lists[N-1]);
		printlist(lists[0]);
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
	
	public static void delete(ListNode head,ListNode deletenode)
	{	
		if((head.next==null) && (deletenode.next==null))
		{
			head=null;
			return;
		}
		if(deletenode.next==null)
		{	
			ListNode p = head;
			
			while(p.next!=deletenode)
			{
				p=p.next;
			}
			p.next = null;
		}
		else
		{
			deletenode.val=deletenode.next.val;
			deletenode.next = deletenode.next.next;
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