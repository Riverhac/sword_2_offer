package Q55;

import java.util.HashMap;
import java.util.Map;

//字符串中第一次只出现一次的字符。方法1、hash表，方法2、ascall映射(其实原理一样)
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "google";
		char result = solve(s);
		System.out.println(result);
	}
	static boolean invalid = false;
	public static char solve(String s)
	{
		int length = s.length();
		if(length==0) 
		{	
			invalid = true;
			return ' ';
		}
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<length;i++)
		{	
			char temp = s.charAt(i);
			if(!map.containsKey(temp)) map.put(temp,1);
			else map.put(temp, map.get(temp)+1);
		}
		for(int i=0;i<length;i++)
		{	
			if(map.get(s.charAt(i))==1) return s.charAt(i);
		}
		invalid = true;
		return ' ';
	}

}
