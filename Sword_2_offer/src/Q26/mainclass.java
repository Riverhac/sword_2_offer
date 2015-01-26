package Q26;

import java.util.HashMap;
import java.util.Map;

//带有随机指针的链表辅复制，有如下方法
//1、一个一个赋值next域，再每一个node匹配随机域
//2、用hashmap保存随机域
//3、在普通后面直接插入一个与前面相同的，前面随机的next就是后面随机的next
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//第一种方法因为时间复杂度为O(n^2)，所以不做演示
	
	public static ComplexListNode solve2(ComplexListNode node)
	{
		//第二种方法，使用hash表
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
		//第三种方法
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
		p=node;//原链表
		ComplexListNode q=node.next;//复制的链表
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