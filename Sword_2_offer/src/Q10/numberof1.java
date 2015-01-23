package Q10;
//��������1�ĸ��������ֽⷨ
//��һ�֣�ÿ������1λ���ж��ǲ���1����������¼������������©�����������λ����,Ҫ�������(java�в����߼�����>>>)
//�ڶ��֣�ȡ1��ÿ��������ԭ�������Ƚ�
//�����֣�����(x-1)&(x)���ܰ����һ��1ȥ���ļ���
public class numberof1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		int result1 = solve1(123456789);
		long time2 = System.currentTimeMillis();
		System.out.println("result1="+result1);
		System.out.println(time2-time1);
		
		time1 = System.currentTimeMillis();
		int result2 = solve2(123456789);
		time2 = System.currentTimeMillis();
		System.out.println("result2="+result2);
		System.out.println(time2-time1);
		
		time1 = System.currentTimeMillis();
		int result3 = solve3(123456789);
		time2 = System.currentTimeMillis();
		System.out.println("result3="+result3);
		System.out.println(time2-time1);
		
		
	}
	public static int solve1(int number)
	{	
		int count = 0;
		while(number!=0)
		{
			if((number & 1) ==1)
				count++;
			number >>>= 1;
		}
		return count;
	}
	
	public static int solve2(int number)
	{	
		int count = 0;
		int flag = 1;
		while(flag!=0)
		{
		if((flag & number) != 0)
			count++;
		flag <<= 1;
		}
		return count;
	}
	
	public static int solve3(int number)
	{	
		int count = 0;
		while(number!=0)
		{
			number = (number-1) & number;
			count++;
		}
		return count;
	}

}
