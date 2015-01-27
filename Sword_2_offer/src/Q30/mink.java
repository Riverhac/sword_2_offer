package Q30;
//最小的k个数，两种方法：
//1、使用快速排序，如果取得的数大于k，则在左边找，如果取得的数小于k，则在右边找
//2、使用最大堆，（就像抽奖一样）
public class mink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,7,9,3,1,23,65,87,45,23,21,24,3,78,65,33,11,44,66,88,9};
		solve1(A,6);
		solve2(A,6);
	}
	public static void solve1(int[] A,int k)
	{	
		//使用快排，时间复杂度O(n)
		int length = A.length;
		if(length==0 || k>length) return;
		int start = 0;
		int end = length-1;
		int index = partition(A,start,end);
		while(index!=k)
		{
			if(index>k)
			{	
				end = index-1;
				index = partition(A,start,end);
			}
			else
			{
				start = index+1;
				index = partition(A,start,end);
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println("");
	}
	public static int partition(int[] A,int start,int end)
	{	
		
		//快排程序，返回第一个值在A中的最后位置
		int flag = A[start];
		while(start < end)
		{
			while(A[end] > flag)
			{
				end--;
			}
			int temp = A[end];
			A[end] = flag;
			A[start] = temp;
			start++;
			if(start < end)
			{
				while(A[start] < flag)
				{
					start++;
				}
				temp = A[start];
				A[start] = flag;
				A[end] = temp;
				end--;
			}
		}
		return start;
	}
	public static void solve2(int[] A,int k)
	{	
		int length = A.length;
		if(length==0 || length < k) return;
		//使用最大堆
		//构建初始化堆，然后每进来一个数，将这个数同最大堆的堆顶进行比较，如果大于堆顶，进行下一个数，如果小于堆顶
		//则将堆顶移除，换成该数，然后对堆进行调整
		//使用heap[k]存储该堆
		int[] heap = new int[k];
		for(int i=0;i<k;i++)
		{
			heap[i] = A[i];
		}
		//调整初始化堆
		for(int i=k/2;i>=0;i--)//从k/2到0置换
		{
			adjustheap(heap,i);
		}
		
		//进行数据流
		for(int i=k;i<length;i++)
		{
			if(A[i] >= heap[0]) continue;
			else
			{	
				heap[0] = A[i];//把堆顶换掉
				//调整堆
				adjustheap(heap,0);
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(heap[i]+" ");
		}
		
	}
	
	public static void adjustheap(int[] heap,int i)//堆的调整
	{		
		int length = heap.length;
		//如果没有右孩子和左孩子
		if(length-1 < 2*i ) return;
		//只有左孩子
		if(length-1 == 2*i) 
		{
			if(heap[i] < heap[2*i])
			{
				int temp = heap[i];
				heap[i] = heap[2*i];
				heap[2*i] = temp;
				adjustheap(heap,2*i);
			}
			else return;
		}
		else
			//左右孩子都有
		{
			if(heap[i] >= heap[2*i] && heap[i]>=heap[2*i+1]) return;
			if(heap[2*i] >=heap[i] && heap[2*i] >= heap[2*i+1])
			{
				int temp = heap[i];
				heap[i] = heap[2*i];
				heap[2*i] = temp;
				adjustheap(heap,2*i);
			}
			else
				if(heap[2*i+1] >=heap[i] && heap[2*i+1] >= heap[2*i])
				{
					int temp = heap[i];
					heap[i] = heap[2*i+1];
					heap[2*i+1] = temp;
					adjustheap(heap,2*i+1);
				}
				
		}
		
			
	}

}
