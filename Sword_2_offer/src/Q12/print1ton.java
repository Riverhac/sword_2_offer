package Q12;
//��ӡ0-nλ�����е��������֣�����Ҫ�������ֳ��꣬����200λ��long��int�������ˣ�����ʹ���ַ������д�ӡ
//����һ�ַ���������ȫ���У�ֻ��û��˳����
public class print1ton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		print1(6);
		long time2 = System.currentTimeMillis();		
		
		long  time3 = System.currentTimeMillis();
		print2(6);
		long time4 = System.currentTimeMillis();
		System.out.println("����7λ�ҵķ���");
		System.out.println(time2-time1);
		System.out.println("����7λ���Ϸ���");
		System.out.println(time4-time3);
		
	}
	
	

	public static void print1(int number)
	{
		if(number < 0) return;
		int[] A = new int[number];
		while(!increment(A))
		{
			printnumber(A);
		}
	}
	
	public static void print2(int number)
	{
		if(number < 0) return;
		int[] A = new int[number];
		while(!increment2(A))
		{
			printnumber(A);
		}
	}
	//���Լ�д�ķ���
	public static boolean increment(int[] A)
	{
		int length = A.length;
		boolean flag = false;
		int index = length-1;
		A[index] = A[index]+1;
		if(A[index] == 10)
			flag =true;
		while(flag == true)
		{	
			if(index==0) return true;
			A[index]=0;
			index--;
			if(A[index]!=9)
			{
				A[index]++;
				flag = false;
			}
			
		}
		return false;
	}
	//���ϵķ���
	public static boolean increment2(int[] A)
	{
		boolean isOverflow = false;
		int nTakeover = 0;
		int length = A.length;
		for(int i=length-1;i>=0;i--)
		{
			int nsum = A[i]+nTakeover;
			if(i==length-1)
				nsum++;
			if(nsum>=10)
			{
				if(i==0)
					isOverflow = true;
			
				else
				{
					nsum-=10;
					nTakeover = 1;
					A[i]=nsum;
				}
			}
			else
			{
				A[i]=nsum;
				break;
			}
		}
		return isOverflow;
	}
	
	public static void printnumber(int[] A)
	{	
		int start = 0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]!=0) 
			{
				start = i;
				break;
			}
			else continue;
		}
		for(int i=start;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
		System.out.println("");
		
	}
}
