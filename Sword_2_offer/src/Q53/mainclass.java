package Q53;
//正则表达式匹配。递归
public class mainclass {


	public static boolean solve(String a,String b)
	{	
		int length1 = a.length();
		int length2 = b.length();
		
		if(length1==0)
			return length2==0;
		 if (length1 == 1) {
	            if (b.equals(a) || b.equals(".") && a.length() == 1) {
	                return true;
	            } else
	                return false;
	        }
		if(b.charAt(1)!='*') 
		{
				if(a.length()>0 && a.charAt(0)==b.charAt(0) || b.charAt(0)=='.')
					return solve(a.substring(1),b.substring(1));
				return false;
		}
		else
		{
			while(a.length()>0 && a.charAt(0)==b.charAt(0) || b.charAt(0)=='.')
			{
				if(solve(a,b.substring(2))) return true;
				a=a.substring(1);
			}
			return solve(a,b.substring(2));
			
		}
		
		
	}
}
