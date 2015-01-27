package Q37;

import java.util.Stack;

//��������ĵ�һ�������ڵ�
//����1����������Ԫ��ѹ��ջ�����϶�����ͬ�ģ��ٵ����������һ��Ԫ����ͬ�ľ��ǵ�һ��������
//����2���ȷֱ�������������õ��ֱ�ĳ��ȣ����ó�һ�������������֮����ô�������߱߱Ƚϣ�ʲôʱ��������Ⱦ�������ڵ�
public class mainclass {
	
	public static ListNode solve1(ListNode list1,ListNode list2)
	{	
		if(list1==null && list2==null) return null;
		Stack<ListNode> stack1 = new Stack<ListNode>();
		Stack<ListNode> stack2 = new Stack<ListNode>();
		ListNode p = list1;
		ListNode q = list2;
		while(p!=null)
		{
			stack1.push(p);
			p=p.next;
		}
		while(q!=null)
		{
			stack2.push(q);
			q=q.next;
		}
		ListNode pre = null;
		while(!stack1.isEmpty() && !stack2.isEmpty())
		{
			ListNode temp1 = stack1.pop();
			ListNode temp2 = stack2.pop();
			if(temp1 == temp2) 
			{	
				pre = temp1;
				continue;
			}
			else return pre;
				
		}
		return pre;
		
	}
	
	public static ListNode solve2(ListNode list1,ListNode list2)
	{
		if(list1==null && list2==null) return null;
		int length1 = 0;
		int length2 = 0;
		ListNode p = list1;
		ListNode q = list2;
		while(p!=null)
		{
			length1++;
			p=p.next;
		}
		while(q!=null)
		{
			length2++;
			q=q.next;
		}
		p = list1;
		q = list2;
		if(length1 > length2)
		{
			for(int i=0;i<length1-length2;i++)
			{
				p=p.next;
			}
		}
		else
		{
			for(int i=0;i<length2-length1;i++)
			{
				q=q.next;
			}
		}
		
		while(p!=null)
		{
			p=p.next;
			q=q.next;
			if(p==q) return p;
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