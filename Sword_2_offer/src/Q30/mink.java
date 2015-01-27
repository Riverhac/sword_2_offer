package Q30;
//��С��k���������ַ�����
//1��ʹ�ÿ����������ȡ�õ�������k����������ң����ȡ�õ���С��k�������ұ���
//2��ʹ�����ѣ�������齱һ����
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
		//ʹ�ÿ��ţ�ʱ�临�Ӷ�O(n)
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
		
		//���ų��򣬷��ص�һ��ֵ��A�е����λ��
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
		//ʹ������
		//������ʼ���ѣ�Ȼ��ÿ����һ�������������ͬ���ѵĶѶ����бȽϣ�������ڶѶ���������һ���������С�ڶѶ�
		//�򽫶Ѷ��Ƴ������ɸ�����Ȼ��Զѽ��е���
		//ʹ��heap[k]�洢�ö�
		int[] heap = new int[k];
		for(int i=0;i<k;i++)
		{
			heap[i] = A[i];
		}
		//������ʼ����
		for(int i=k/2;i>=0;i--)//��k/2��0�û�
		{
			adjustheap(heap,i);
		}
		
		//����������
		for(int i=k;i<length;i++)
		{
			if(A[i] >= heap[0]) continue;
			else
			{	
				heap[0] = A[i];//�ѶѶ�����
				//������
				adjustheap(heap,0);
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(heap[i]+" ");
		}
		
	}
	
	public static void adjustheap(int[] heap,int i)//�ѵĵ���
	{		
		int length = heap.length;
		//���û���Һ��Ӻ�����
		if(length-1 < 2*i ) return;
		//ֻ������
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
			//���Һ��Ӷ���
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
