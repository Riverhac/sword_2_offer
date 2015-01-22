package Q5;

import java.util.Stack;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�鿴4���ڵ�ʱ�����
		ListNode head = new ListNode(1);
		ListNode s1 = new ListNode(2);
		ListNode s2 = new ListNode(3);
		ListNode s3 = new ListNode(4);
		head.next = s1;
		s1.next = s2;
		s2.next = s3;
		System.out.println("��һ�ַ�����");
		liststack(head);
		System.out.println("");
		System.out.println("�ڶ��ַ�����");
		listrecursive(head);
		System.out.println("");
		System.out.println("�����ַ�����");
		ListNode resverselist3 = listinserthead(head);
		printlist(resverselist3);
		System.out.println("");
		
		//�鿴5000���ڵ�ʱ����ʱ�����
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
		System.out.println("��һ�ַ�����");
		long time1 = System.currentTimeMillis();
		liststack(lists[0]);
		long time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.print("�ķ�ʱ�䣺");
		System.out.println(time2-time1);
		System.out.println("�ڶ��ַ�����");
		time1 = System.currentTimeMillis();
		listrecursive(lists[0]);
		time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.print("�ķ�ʱ�䣺");
		System.out.println(time2-time1);
		System.out.println("�����ַ�����");
		time1 = System.currentTimeMillis();
		ListNode resverselist = listinserthead(lists[0]);
		printlist(resverselist);
		time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.print("�ķ�ʱ�䣺");
		System.out.println(time2-time1);
		//�ɼ�ջ�Ĳ����ȽϷ�ʱ��������Ĳ����ȽϽ�ʡʱ��
		
	}
	
	//����ջ�ķ�ʽ����˳������Ȼ��pop����ʵ���������ӡ
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
	
	
	//ʹ�õݹ鷽ʽ���ȴ�ӡ����һ���ڵ��ʣ������ĵ����ٴ�ӡ�ýڵ�
	public static void listrecursive(ListNode head)
	{
		if(head==null) return;
		listrecursive(head.next);
		System.out.print(head.val+" ");
	}
	
	
	//����ͷ������ķ�����������Ȼ���ӡ����
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
