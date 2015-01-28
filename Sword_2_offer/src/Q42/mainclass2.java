package Q42;
//×Ö·û´®µÄ×óÐý£¬
public class mainclass2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		int number = 2;
		String result = solve(s,number);
		System.out.println(result);
	}
	public static String solve(String s,int number)
	{
		int length = s.length();
		if(length == 0 || number > length) return "";
		StringBuffer sb = new StringBuffer(s);
		
		sb = myreverse(sb,0,number-1);
		sb = myreverse(sb,number,length-1);
		sb = myreverse(sb,0,length-1);
		return sb.toString();
	}
	public static StringBuffer myreverse(StringBuffer sb,int start,int end)
	{
		while(start<end)
		{
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			start++;
			end--;
		}
		return sb;
	}

}
