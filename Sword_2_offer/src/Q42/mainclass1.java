package Q42;
//反转单词顺序，先翻转整个String，再翻转其中的单词(不用split将单词变成String数组，再从后往前组合)
public class mainclass1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  i am      a student.       ";
		String result = solve(s);
		System.out.println(result);
	}

	public static String solve(String s)
	{	
		int length = s.length();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		int start = 0;
		
		while(sb.charAt(start) == ' ') start++;
		int end = start;

		while(end <length)
		{
			if(sb.charAt(end) == ' ')
			{
				int i=start;int j=end-1;
				while(i<j)
				{
					char temp = sb.charAt(i);
					sb.setCharAt(i, sb.charAt(j));
					sb.setCharAt(j, temp);
					i++;
					j--;
				}
				end++;
				while(end<length && sb.charAt(end) == ' ') end++;				
				start = end;
			}
			else
				end++;
		}
		if(start!=end)
		{
			//处理最后一个
			int i=start;int j=end-1;
			while(i<j)
			{
				char temp = sb.charAt(i);
				sb.setCharAt(i, sb.charAt(j));
				sb.setCharAt(j, temp);
			}
		}
		return sb.toString();
	}
}
