package Q11;
//数值的整数次方，要注意的是：指数是负数还是正数还是0
//2解法，第一种为常规解法，即相乘，第二种为两个1/2次幂的相乘
public class mypower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		double result1 = solve1(1.032435,100000);
		long time2 = System.currentTimeMillis();		
		System.out.println("result1="+result1);
		System.out.println(time2-time1);
		time1 = System.currentTimeMillis();
		double result2 = solve2(1.032435,100000);
		time2 = System.currentTimeMillis();
		System.out.println("result2="+result2);
		System.out.println(time2-time1);
	}
	
	
	public static double solve1(double base,int exp)
	{
		if(base>-0.0000001 && base < 0.0000001 && exp<0) return 0.0;
		boolean flag = true;
		if(exp<0) flag = false;
		double result = 1.0;
		for(int i=0;i<Math.abs(exp);i++)
		{
			result = result*base;
		}
		if(flag==false) result=1/result;
		return result;
		
	}
	public static double solve2(double base,int exp)
	{	
		if(base>-0.0000001 && base < 0.0000001 && exp<0) return 0.0;
		boolean flag = true;
		if(exp<0) flag = false;
		double result;
		
		if(flag==false) 
		{	
			result = solve2_1(base,-exp);
			result=1/result;
		}
		else
		{
			result = solve2_1(base,exp);
		}
		return result;
	}
	public static double solve2_1(double base,int exp)
	{
		if(exp == 0) return 1;
		if(exp == 1) return base;
		
		double result1 = solve2(base,exp>>1);
		result1 *= result1;
		if((exp & 1) == 1)  return result1*base;
		else return result1;
	}
}
