package Q34;
//找出第n个丑数，2中方法
//1、一个一个试，如果只包含2,3,5，则通过
//2、空间换时间，一个一个向后推进
public class choushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		long time1 = System.currentTimeMillis();
		int result1 = solve1(N);
		long time2 = System.currentTimeMillis();
		System.out.println("方法1： "+result1);
		System.out.print("时间：");
		System.out.println(time2-time1);
		long time3 = System.currentTimeMillis();
		int result2 = solve2(N);
		long time4 = System.currentTimeMillis();
		System.out.println("方法2： "+result2);
		System.out.print("时间：");
		System.out.println(time4-time3);
		
		//1，2，3，4，5，6，8，9，10，12，15
	}
	public static int solve1(int n)
	{	
		if(n<=0) return 0;
		int i=0;
		int j=0;
		while(i<n)
		{
			j++;
			if(is(j)==true)
			{
				i++;
			}	
		}
		return j;
	}
	public static boolean is(int j)
	{
		while((j & 1) ==0) 
			j>>=1;
		while(j%3==0)
			j/=3;
		while(j%5==0)
			j/=5;
		if(j==1) return true;
		else return false;
	}
	
	public static int solve2(int n)
	{
		int temp2 = 0;
		int temp3 = 0;
		int temp5 = 0;
		int[] A = new int[n];
		A[0] = 1;
		for(int i=1;i<n;i++)
		{			
			if((2*A[temp2] <= 3*A[temp3]) && (2*A[temp2] <= 5*A[temp5]) )
			{	
				A[i] = 2*A[temp2];							
			}
			else
			if((3*A[temp3] <= 2*A[temp2]) && (3*A[temp3] <= 5*A[temp5]) )
			{	
				A[i] = 3*A[temp3];							
			}
			else
			if((5*A[temp5] <= 2*A[temp2]) && (5*A[temp5] <= 3*A[temp3]) )
			{	
				A[i] = 5*A[temp5];								
			}
			while(2*A[temp2] <=A[i]) temp2++;
			while(3*A[temp3] <=A[i]) temp3++;
			while(5*A[temp5] <=A[i]) temp5++;
				
		}
		return A[n-1];
	}
}
