package Q45;

import java.util.ArrayList;
import java.util.List;

//从圆圈中删除数字，书上给了两种方法，第二中方法采用数学技巧，直接得到结果，我用第一种方法演示
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solve(5,3);
		System.out.println(result);
	}
	public static int solve(int n,int m)
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(i);
		}
		int index = 0;
		while(list.size() >1 )
		{
			for(int j=1;j<m;j++)
			{	
				
				if(index==list.size()-1) index=0;
				else index++;
			}
			list.remove(index);
			if(index==list.size()) index=0;
			
		}
		return list.get(0);
	}
}
