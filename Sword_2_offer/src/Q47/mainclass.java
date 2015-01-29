package Q47;
//使用位运算来计算加法
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solve(5,10);
		System.out.println(result);
	}
	public static int solve(int a,int b)
	{
		int temp;
		do
		{
			temp = a & b;
			temp<<=1;
			a = a^b;
			b = temp;
		}
		while(temp!=0);
		return a;
	}
	

}
