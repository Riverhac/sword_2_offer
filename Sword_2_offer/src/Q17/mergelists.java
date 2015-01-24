package Q17;
//合并两个list，书上用的递归，我没用递归
public class mergelists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] lists1 = new ListNode[50];
		for(int i=0;i<50;i++)
		{
			lists1[i]=new ListNode(2*i);
		}
		for(int i=0;i<50-1;i++)
		{
			lists1[i].next = lists1[i+1];
		}
		
		ListNode[] lists2 = new ListNode[80];
		for(int i=0;i<80;i++)
		{
			lists2[i]=new ListNode(3*i);
		}
		for(int i=0;i<80-1;i++)
		{
			lists2[i].next = lists2[i+1];
		}
		ListNode head = merge(lists1[0],lists2[0]);
		printlist(head);
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
	public static ListNode merge(ListNode list1,ListNode list2)
	{
		if(list1==null) return list2;
		if(list2==null) return list1;
		ListNode p1 = list1;
		ListNode p2 = list2;
		ListNode head = null;
		ListNode p = null;
		if(p1.val >p2.val) 
		{
			head = p2;
			p2=p2.next;
		}
		else 
		{
			head = p1;
			p1=p1.next;
		}
		p=head;
		while((p1!=null) && (p2!=null))
		{
			if(p1.val > p2.val)
			{	
				
				p.next = p2;
				p=p.next;
				p2=p2.next;
			}
			else
			{	
				
				p.next = p1;
				p=p.next;
				p1=p1.next;
			}
		}
		while(p1!=null)
		{
			p.next = p1;
			p=p.next;
			p1=p1.next;
		}
		while(p2!=null)
		{
			p.next = p2;
			p=p.next;
			p2=p2.next;
		}
		return head;
		
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