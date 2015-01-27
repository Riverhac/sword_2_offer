package Q31;
//��������������ͣ����ֽⷨ
//1�����������
//2����̬�滮
public class mainclass {

	boolean invalidinput = false;
	public  int solve1(int[] A)
	{
		//����1
		int length = A.length;
		if(length == 0) 
		{	
			invalidinput = true;
			return 0;
		}
		int currentsum = 0;
		int greatestsum = Integer.MIN_VALUE;
		for(int i=0;i<length;i++)
		{
			if(currentsum <=0)
				currentsum = A[i];
			else
				currentsum += A[i];
			if(currentsum > greatestsum) 
				greatestsum = currentsum;
				
		}
		return greatestsum;
	}
	
	public  int solve2(int[] A)
	{
		//����2 dp(��ʵ���ʾ��ǵ�һ�֣����԰������õ����õ����ǵ�һ���ˣ���ʵҲû��Ҫ���飬��Ϊÿ��ֻ��Ҫ����������)
		int length = A.length;
		if(length == 0) 
		{	
			invalidinput = true;
			return 0;
		}
		if(length==1) return A[0];
		int[] sum= new int[length];
		sum[0]=A[0];
		int greatsum = Integer.MIN_VALUE;
		for(int i=1;i<length;i++)
		{
			if(sum[i-1]<=0) sum[i]=A[i];
			else sum[i] = sum[i-1]+A[i];
			if(sum[i]>greatsum) greatsum = sum[i];
		}
		return greatsum;
	}
}
