package Q17;
//合并两个list，书上用的递归，我没用递归
public class mergelists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int N1=1000000;
		int N2=1000000;
		//我的方法（迭代）
		ListNode[] lists1 = new ListNode[N1];
		for(int i=0;i<N1;i++)
		{
			lists1[i]=new ListNode(2*i);
		}
		for(int i=0;i<N1-1;i++)
		{
			lists1[i].next = lists1[i+1];
		}
		
		ListNode[] lists2 = new ListNode[N2];
		for(int i=0;i<N2;i++)
		{
			lists2[i]=new ListNode(3*i);
		}
		for(int i=0;i<N2-1;i++)
		{
			lists2[i].next = lists2[i+1];
		}
		long time1 = System.currentTimeMillis();
		ListNode head1 = merge(lists1[0],lists2[0]);
		long time2 = System.currentTimeMillis();
		//printlist(head1);
		System.out.print("花费时间:");
		System.out.println(time2-time1);
		
		//书上方法（递归）
		ListNode[] lists3 = new ListNode[N1];
		for(int i=0;i<N1;i++)
		{
			lists3[i]=new ListNode(2*i);
		}
		for(int i=0;i<N1-1;i++)
		{
			lists3[i].next = lists3[i+1];
		}
		
		ListNode[] lists4 = new ListNode[N2];
		for(int i=0;i<N2;i++)
		{
			lists4[i]=new ListNode(3*i);
		}
		for(int i=0;i<N2-1;i++)
		{
			lists4[i].next = lists4[i+1];
		}
		long time3 = System.currentTimeMillis();
		ListNode head2 = merge(lists3[0],lists4[0]);
		long time4 = System.currentTimeMillis();
		//printlist(head2);
		System.out.print("花费时间:");
		System.out.println(time4-time3);
		
		//花费时间分别为16和0，可见递归时间要好些，但是空间使用非常多
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

	
	public static ListNode merge1(ListNode list1,ListNode list2)
	{
		if(list1==null) return list2;
		if(list2==null) return list1;
		ListNode mergehead = null;
		if(list1.val < list2.val)
		{	
			mergehead = list1;
			mergehead.next = merge1(list1.next,list2);
		}
		else
		{
			mergehead = list2;
			mergehead.next = merge1(list1,list2.next);
		}
		return mergehead;
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