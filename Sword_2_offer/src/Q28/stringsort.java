package Q28;
//�ַ�����ȫ���У�һ��ʼʹ��char���飬�������ֲ��У���Ϊchar���鴫�������ı�ԭ����ֵ����������һ����String
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
				//����
				char temp = s.charAt(i);
				sb.setCharAt(i, s.charAt(start));
				sb.setCharAt(start, temp);
		
				solve(sb.toString(),start+1,end);
			}
		}
	}
	
}
