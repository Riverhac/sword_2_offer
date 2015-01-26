package Q26;

import java.util.HashMap;
import java.util.Map;

//�������ָ����������ƣ������·���
//1��һ��һ����ֵnext����ÿһ��nodeƥ�������
//2����hashmap���������
//3������ͨ����ֱ�Ӳ���һ����ǰ����ͬ�ģ�ǰ�������next���Ǻ��������next
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//��һ�ַ�����Ϊʱ�临�Ӷ�ΪO(n^2)�����Բ�����ʾ
	
	public static ComplexListNode solve2(ComplexListNode node)
	{
		//�ڶ��ַ�����ʹ��hash��
		if(node==null) return null;
		ComplexListNode p =node;
		ComplexListNode qhead =new ComplexListNode(node.val);
		ComplexListNode q = qhead;
		Map<ComplexListNode,ComplexListNode> map = new HashMap<ComplexListNode,ComplexListNode>();
		map.put(p,qhead);
		p=p.next;
		while(p!=null)
		{
			ComplexListNode temp =new ComplexListNode(p.val);
			q.next = temp;
			temp = q;
			map.put(p,q);
			p=p.next;
		}
		p=node;
		q=qhead;
		while(p!=null)
		{
			q.randomnext = map.get(p.randomnext);
			p=p.next;
			q=q.next;
		}
		return qhead;
		
	}
	public static ComplexListNode solve3(ComplexListNode node)
	{	
		//�����ַ���
		if(node==null) return null;
		ComplexListNode p = node;
		while(p!=null)
		{
			ComplexListNode temp = new ComplexListNode(p.val);
			temp.next = p.next;
			p.next = temp;
			p=temp.next;
		}
		p=node;
		while(p!=null)
		{
			p.next.randomnext = p.randomnext.next;
			p=p.next.next;
		}
		p=node;//ԭ����
		ComplexListNode q=node.next;//���Ƶ�����
		ComplexListNode qhead = node.next;
		while(p.next.next!=null)
		{
			ComplexListNode temp = q.next;
			q.next = temp.next;
			p.next = temp;
			p=temp;
			q=temp.next;		
		}
		p.next = null;
		q.next = null;
		return qhead;
		
	}

}
class ComplexListNode {
    int val;
    ComplexListNode next;
    ComplexListNode randomnext;
    ComplexListNode(int x) {
        val = x;
        next = null;
        randomnext=null;
    }
}