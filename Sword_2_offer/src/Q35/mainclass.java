package Q35;

import java.util.HashMap;
import java.util.Map;

//第一个只出现1次的字符
//hashmap也可以用256个大小的数组
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abaccdeff";
		char result = solve(s);
		System.out.println(result);
	}
	
	public static char solve(String s)
	{	
		int length = s.length();
		if(length==0) return '0';
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<length;i++)
		{	
			char temp = s.charAt(i);
			if(map.containsKey(temp))
				map.put(temp, map.get(temp)+1);
			else map.put(temp, 1);
		}
		for(int i=0;i<length;i++)
		{	
			char temp = s.charAt(i);
			if(map.get(temp)==1) return temp;
		}
		return '0';
	}

}
