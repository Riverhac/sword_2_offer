package Q65;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,3,4,2,6,2,5,1}; 
		List<Integer> result = solve(A,3);
		for(int temp:result)
		{
			System.out.print(temp+" ");
		}
	}
	
	public static List<Integer> solve(int[] A,int k)
	{	
		int length = A.length;
		if(length==0 || k<=0 || k>length) return null;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> queue = new LinkedList<Integer>();//因为java中queue不能实现取得末尾字符，所以索性用queue实现形式linkedlist进行。
		//为了不影响性能，采用一个变量size保存queue里面的item数量
		int size = 0;
		for(int i=0;i<k;i++)
		{
			
			while(!queue.isEmpty() && A[i] >= A[queue.get(size-1)])
			{
				queue.remove(size-1);
				size--;
			}
			queue.add(i);
			size++;
		}
		for(int i=k;i<length;i++)
		{
			list.add(A[queue.get(0)]);
			while(!queue.isEmpty() && A[i]>=A[queue.get(size-1)])
			{
				queue.remove(size-1);
				size--;
			}
			if(!queue.isEmpty() && queue.get(0) <= (i-k))
				queue.remove(0);
			queue.add(i);
			size++;
		}
		list.add(A[queue.get(0)]);
		return list;
	}
	

}
