package Q10;
//二进制中1的个数，三种解法
//第一种，每次右移1位，判断是不是1，如果是则记录，这种做法有漏洞，即如果数位负数,要考虑清楚(java中采用逻辑右移>>>)
//第二种，取1，每次左移与原来的数比较
//第三种，采用(x-1)&(x)就能把最后一个1去掉的技巧
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
