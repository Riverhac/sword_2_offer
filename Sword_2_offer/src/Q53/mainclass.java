package Q53;
//������ʽƥ�䡣�ݹ�
//û������*����������
//����*�����������1��*ǰ����ͬ�����3������һ��������ƥ��*���棬�ڶ�����ƥ��*ǰ���Ǹ�����������������*����ǰ���Ǹ���
//2��*ǰ�治ͬ��������*��ƥ��*�����
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
