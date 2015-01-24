package Q15;



public class reversek {

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
		ListNode temp = solve(lists[0],5);
		if(temp==null) System.out.println("输入有问题！");
		else
			System.out.println(temp.val);
	}

	
	public static ListNode solve(ListNode head,int k)
	{	
		if(head==null) return null;
		if(k<=0) return null;
		//先跑k个,遇到结束则终止
		ListNode first = head;
		ListNode second = head;
		for(int i=0;i<k-1;i++)
		{				
			first = first.next;
			if(first==null) return null;
		}
		
		while(first.next!=null)
		{
			first=first.next;
			second=second.next;
		}
		return second;
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