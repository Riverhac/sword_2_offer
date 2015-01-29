package Q49;
//½«×Ö·û´®×ª»¯Îªint
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solve("+34548888");
		if(invalid == true) System.out.println("ÊäÈë´íÎó£¡");
		else
		System.out.println(result);
	}
	public static boolean invalid = false;
	public static int solve(String s)
	{
		int length = s.length();
		if(length == 0) 
		{
			invalid = true;
			return 0;
		}
		boolean fushu = false;
		int start = 0;
		if(s.charAt(0) == '-') 
		{
			fushu = true;
			start++;
		}
		if(s.charAt(0) == '+') 
		{
			start++;
		}
		int sum = 0;
		for(int i=start;i<length;i++)
		{	
			char temp = s.charAt(i);
			if(isnumber(temp)) 
			{
				//³¬int·¶Î§ÅĞ¶Ï
				if(sum > (Integer.MAX_VALUE-(temp-'0'))/10) 
				{
					invalid = true;
					return 0;
				}
				sum = 10*sum + temp-'0';
			}
			else 
			{
				invalid = true;
				return 0;
			}
		}
		return fushu==true?-sum:sum;
		
		
		
	}
	public static boolean isnumber(char c)
	{
		if(c-'0' >=0 && c-'0'<=9) return true;
		else return false;
	}

}
