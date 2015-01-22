package Q5;

import java.util.Stack;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//查看4个节点时的情况
		ListNode head = new ListNode(1);
		ListNode s1 = new ListNode(2);
		ListNode s2 = new ListNode(3);
		ListNode s3 = new ListNode(4);
		head.next = s1;
		s1.next = s2;
		s2.next = s3;
		System.out.println("第一种方法：");
		liststack(head);
		System.out.println("");
		System.out.println("第二种方法：");
		listrecursive(head);
		System.out.println("");
		System.out.println("第三种方法：");
		ListNode resverselist3 = listinserthead(head);
		printlist(resverselist3);
		System.out.println("");
		
		//查看5000个节点时花费时间情况
		int N=5000;
		ListNode[] lists = new ListNode[N];
		for(int i=0;i<N;i++)
		{
			lists[i]=new ListNode(i);
		}
		for(int i=0;i<N-1;i++)
		{
			lists[i].next = lists[i+1];
		}
		System.out.println("第一种方法：");
		long time1 = System.currentTimeMillis();
		liststack(lists[0]);
		long time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.print("耗费时间：");
		System.out.println(time2-time1);
		System.out.println("第二种方法：");
		time1 = System.currentTimeMillis();
		listrecursive(lists[0]);
		time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.print("耗费时间：");
		System.out.println(time2-time1);
		System.out.println("第三种方法：");
		time1 = System.currentTimeMillis();
		ListNode resverselist = listinserthead(lists[0]);
		printlist(resverselist);
		time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.print("耗费时间：");
		System.out.println(time2-time1);
		//可见栈的操作比较费时，而链表的操作比较节省时间
		
	}
	
	//采用栈的方式保存顺序链表，然后pop就能实现链表倒序打印
	public static void liststack(ListNode head)
	{	
		if(head==null) return;
		ListNode p=head;
		Stack<Integer> stack = new Stack<Integer>();
		while(p!=null)
		{
			stack.push(p.val);
			p=p.next;
		}
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+" ");
		}
		
	}
	
	
	//使用递归方式，先打印除第一个节点的剩余链表的倒序，再打印该节点
	public static void listrecursive(ListNode head)
	{
		if(head==null) return;
		listrecursive(head.next);
		System.out.print(head.val+" ");
	}
	
	
	//采用头部插入的方法倒置链表，然后打印链表
	public static ListNode listinserthead(ListNode head)
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
	public static void printlist(ListNode phead)
	{
		while(phead !=null)
		{
			System.out.print(phead.val+" ");
			phead = phead.next;
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
