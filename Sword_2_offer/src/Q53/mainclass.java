package Q53;
//正则表达式匹配。递归
//没有遇到*，正常处理
//遇到*，两种情况。1、*前面相同，则分3步。第一步，继续匹配*后面，第二步，匹配*前面那个数，第三步，不管*和其前面那个数
//2、*前面不同，则无视*，匹配*后面的
public class mainclass {
	public static boolean ismatch(String s,String p)
	{	
		return ismatchcore(s,p,0,0); 
		
	}
	
	public static boolean ismatchcore(String s,String p,int indexs,int indexp)
	{
		int lengths = s.length();
		int lengthp = p.length();
		if(indexs == lengths-1 && indexp==lengthp-1) return true;
		if(indexs != lengths-1 && indexp==lengthp-1) return false;
		if(p.charAt(indexp+1)=='*') 
		{
			if(s.charAt(indexs) == p.charAt(indexp) || (p.charAt(indexp)=='.' && indexs!=lengths-1))
			 return ismatchcore(s,p,indexs+1,indexp+2) || ismatchcore(s,p,indexs,indexp+2) || ismatchcore(s,p,indexs+1,indexp);
			else return ismatchcore(s,p,indexs,indexp+2);
		}
		if(s.charAt(indexs) == p.charAt(indexp) || (p.charAt(indexp)=='.' && indexs!=lengths-1))
			return ismatchcore(s,p,indexs+1,indexp+1);
		return false;
	}
}
