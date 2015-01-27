package Q33;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//使用一种排序规则，将数组排成一个最小的数
public class mainclass {

	public static String solve(int[] A)
	{	
		int length = A.length;
		if(length==0) return "";
		Integer[] A1 = new Integer[length];
		for(int i=0;i<length;i++)
		{
			A1[i]=A[i];
		}
		
		Arrays.sort(A1, new myComparator());
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++)
		{
			sb.append(A[i]);
		}
		return sb.toString();
	}
	
	

}


class myComparator implements Comparator<Integer> {  
	public int compare(Integer m1, Integer m2) {  

		String str1 = String.valueOf(m1);
		String str2 = String.valueOf(m2);
    	StringBuffer sb1 = new StringBuffer(str1);
		sb1.append(str2);

		StringBuffer sb2 = new StringBuffer(str2);
		sb2.append(str1);
		return mycompare(sb1.toString(),sb2.toString());
    }
	
	public  int mycompare(String s1,String s2)
	{	//-2表示出错，-1表示小于，0表示等于，1表示大于
		int length1 = s1.length();
		int length2 = s2.length();
		if(length1 == 0 || length2 == 0 || length1!=length2) return -2;
		for(int i=0;i<length1;i++)
		{	
			int a1 = s1.charAt(i)-'0';
			int a2 = s2.charAt(i)-'0';
			if(!(a1>=0 && a1<=9 && a2>=0 && a2<=9)) return -2;
			else
			{	
				if(a1==a2)
				{
					if(i!=length1-1) continue;
					else return 0;
				}
				if(a1>a2) return 1;
				else return -1;
			}
		}
		return 1;
	}

}  
