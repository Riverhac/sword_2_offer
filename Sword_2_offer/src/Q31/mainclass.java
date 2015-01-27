package Q31;
//连续子数组的最大和，两种解法
//1、用数组规律
//2、动态规划
public class mainclass {

	boolean invalidinput = false;
	public  int solve1(int[] A)
	{
		//方法1
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
		//方法2 dp(其实本质就是第一种，可以把数组拿掉，拿掉就是第一种了，其实也没必要数组，因为每次只需要保存两个数)
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
