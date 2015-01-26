package Q28;
//字符串的全排列，一开始使用char数组，后来发现不行，因为char数组传入参数会改变原来的值，改用书上一样的String
public class stringsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		sortstring(s);
	}
	public static void sortstring(String s)
	{	
		int length = s.length();
		if(length==0) return;
		solve(s,0,length-1);
	}
	
	public static void solve(String s,int start,int end)
	{
		if(start==end)
		{
			System.out.println(s);
		}
		else
		{
			for(int i=start;i<=end;i++)
			{	
				StringBuffer sb = new StringBuffer(s);
				//交换
				char temp = s.charAt(i);
				sb.setCharAt(i, s.charAt(start));
				sb.setCharAt(start, temp);
		
				solve(sb.toString(),start+1,end);
			}
		}
	}
	
}
