package Q9;
//쳲��������У������ֽⷨ����ֱ�۵ľ��ǵݹ飬Ҳ�����ġ��ϺõĽⷨ��һάDP
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		int result1 = solve1(40);
		long time2 = System.currentTimeMillis();
		long time3 = System.currentTimeMillis();
		int result2 = solve2(40);
		long time4 = System.currentTimeMillis();
		
		System.out.println(result1);
		System.out.print("��ʱ��");
		System.out.println(time2-time1);
		System.out.println(result2);
		System.out.print("��ʱ��");
		System.out.println(time4-time3);
	}
	
	public static int solve1(int n)
	{	//�ݹ���
		if(n==0) return 0;
		if(n==1) return 1;
		return solve1(n-1)+solve1(n-2);
	}
	public static int solve2(int n)
	{	
		if(n==0) return 0;
		if(n==1) return 1;
		int a=0;
		int b=1;
		int f=0;
		for(int i=0;i<n-1;i++)
		{
			f=a+b;
			a=b;
			b=f;
		}
		return f;
	}
}
